package com.example.countryservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FetchCountryService {

    private static Object allCountries = null;

    public FetchCountryService() throws Exception {
        initData();
    }

    public void initData() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        URI jsonUrl = new URI("https://restcountries.com/v3.1/all");
        allCountries = jsonMapper.readValue(jsonUrl.toURL(), ArrayList.class);
    }

    public static Object getAllCountries() {
        return allCountries;
    }

}
