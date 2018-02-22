package com.brennan.cs566.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ZipInfo {
    private String zip;
    private String location;
    private String county;
    private String metroArea;
    private String landArea;
    private String elevation;
    private int population;
    private int homeValue;
    private int householdIncome;
    private double medianAge;
    private int businesses;
    private int employees;

    public static class ZipInfoBuilder {

        public ZipInfoBuilder population(String population) {
            this.population = Integer.parseInt(population.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public ZipInfoBuilder homeValue(String homeValue) {
            this.homeValue = Integer.parseInt(homeValue.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public ZipInfoBuilder householdIncome(String householdIncome) {
            this.householdIncome = Integer.parseInt(householdIncome.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public ZipInfoBuilder businesses(String businesses) {
            this.businesses = Integer.parseInt(businesses.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public ZipInfoBuilder employees(String employees) {
            this.employees = Integer.parseInt(employees.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public ZipInfoBuilder medianAge(String medianAge) {
            this.medianAge = Double.parseDouble(medianAge.replaceAll("[^\\d.]+", ""));
            return this;
        }
    }

}