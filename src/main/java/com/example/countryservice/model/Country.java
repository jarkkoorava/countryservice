package com.example.countryservice.model;

public class Country {

    private String name;
    private String country_code;
    private String capital;
    private String flag_file_url;
    private int population;

    public Country(String name, String country_code, String capital, String flag_file_url, int population) {
        this.name = name;
        this.country_code = country_code;
        this.capital = capital;
        this.flag_file_url = flag_file_url;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCapital() {
        return capital;
    }

    public String getFlag_file_url() {
        return flag_file_url;
    }

    public int getPopulation() {
        return population;
    }
}
