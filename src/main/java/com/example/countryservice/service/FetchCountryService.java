package com.example.countryservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class FetchCountryService {

    private static Object allCountries = null;

    public FetchCountryService() {
        initData();
    }

    public void initData() {
        RestTemplate template = new RestTemplate();
        allCountries = template.getForObject("https://restcountries.com/v3.1/all", Object[].class);
    }

    public static Object getAllCountries() {
        return allCountries;
    }

}
