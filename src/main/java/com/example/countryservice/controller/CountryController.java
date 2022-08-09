package com.example.countryservice.controller;

import com.example.countryservice.service.FetchCountryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping
public class CountryController {

    @Autowired
    private FetchCountryService fetchCountryService;

    @GetMapping("/countries")
    public Object getAllCountries() {
        // System.out.println("Data containing all countries:");
        System.out.println("Data type is:" + FetchCountryService.getAllCountries().getClass());
        // System.out.println(FetchCountryService.getAllCountries());
        return FetchCountryService.getAllCountries();
    }

    @GetMapping("/countries/{name}")
    public Object getSingleCountry(@PathVariable("name") String name) {
        return FetchCountryService.getSingleCountry(name);
    }

}
