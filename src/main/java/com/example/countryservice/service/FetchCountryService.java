package com.example.countryservice.service;

import com.example.countryservice.model.CountriesResponse;
import com.example.countryservice.model.Country;
import com.example.countryservice.model.FilteredCountry;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class FetchCountryService {

    private Map<String, Country> countryMap = new HashMap<>();

    public FetchCountryService() throws Exception {
        initData();
    }

    public void initData() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        URI jsonUrl = new URI("https://restcountries.com/v3.1/all");
        ArrayList list = jsonMapper.readValue(jsonUrl.toURL(), ArrayList.class);
        for (Object listNode : list) {

            Map listNodeAsMap = (Map) listNode;

            Map nodeNameMap = (Map) listNodeAsMap.get("name");
            String common = (String) nodeNameMap.get("common");

            String code = (String) listNodeAsMap.get("cca2");

            ArrayList nodeCapitalMap = (ArrayList) listNodeAsMap.get("capital");
            String capital = "";
            if (nodeCapitalMap != null ) {
                capital = (String) nodeCapitalMap.get(0);
            }

            Map nodeFlagMap = (Map) listNodeAsMap.get("flags");
            String flag_file_url = (String) nodeFlagMap.get("svg");

            Integer population = (Integer) listNodeAsMap.get("population");

            Country country = new Country(common, code, capital, flag_file_url, population);
            this.countryMap.put(common.toLowerCase(), country);
        }
    }

    public Object getAllCountries() {
        CountriesResponse response = new CountriesResponse();
        List<FilteredCountry> filteredCountries = response.getCountries();
        for (Country country : this.countryMap.values()) {
            FilteredCountry filteredCountry = new FilteredCountry(country.getName(), country.getCountry_code());
            filteredCountries.add(filteredCountry);
        }
        return response;
    }

    public Object getSingleCountry(String name) {
        Object country = countryMap.get(name.toLowerCase());
        return country;
    }
}
