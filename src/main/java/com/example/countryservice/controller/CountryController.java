package com.example.countryservice.controller;

import com.example.countryservice.service.FetchCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CountryController {

    @Autowired
    private FetchCountryService fetchCountryService;

    @GetMapping("/countries")
    public Object getAllCountries() throws IOException {
        System.out.println("Data type for all countries is: " + this.fetchCountryService.getAllCountries().getClass());
        return this.fetchCountryService.getAllCountries();
    }

    @GetMapping("/countries/{name}")
    public Object getSingleCountry(@PathVariable("name") String name) {
        System.out.println("Data type for single country is: " + this.fetchCountryService.getSingleCountry(name).getClass());
        return this.fetchCountryService.getSingleCountry(name);

    }

}
