package com.example.countryservice.model;

public class FilteredCountry {

    private String name;
    private String country_code;

    public FilteredCountry(String name, String country_code) {
        this.name = name;
        this.country_code = country_code;
    }


    public String getName() {
        return name;
    }

    public String getCountry_code() {
        return country_code;
    }


}
