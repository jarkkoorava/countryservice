package com.example.countryservice.controller;

import com.example.countryservice.service.FetchCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CountryController {

    @Autowired
    private FetchCountryService fetchCountryService;

    @GetMapping("/countries/")
    public Object getAllCountries() {
        // System.out.println("Data containing all countries:");
        System.out.println("Data type is:" + FetchCountryService.getAllCountries().getClass());
        // System.out.println(FetchCountryService.getAllCountries());
        return FetchCountryService.getAllCountries();
    }

}
