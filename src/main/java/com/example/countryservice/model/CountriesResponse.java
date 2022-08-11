package com.example.countryservice.model;

import java.util.ArrayList;
import java.util.List;

public class CountriesResponse {

        private List<FilteredCountry> countries = new ArrayList<>();

        public CountriesResponse() {
        }

        public List<FilteredCountry> getCountries() {
            return countries;
        }

        public void setCountries(List<FilteredCountry> countries) {
            this.countries = countries;
        }
}
