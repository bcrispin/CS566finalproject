package com.brennan.cs566.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RouteInfo {
    private String routeId;
    private String routeType;
    private String county;
    private int businesses;
    private int apartments;
    private int poBoxes;
    private int residentials;
    private int totalDeliveries;
    private int householdIncome;
    private int propertyValue;

    public static class RouteInfoBuilder {

        public RouteInfoBuilder apartments(String apartments) {
            this.apartments = Integer.parseInt(apartments.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public RouteInfoBuilder poBoxes(String poBoxes) {
            this.poBoxes = Integer.parseInt(poBoxes.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public RouteInfoBuilder householdIncome(String householdIncome) {
            this.householdIncome = Integer.parseInt(householdIncome.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public RouteInfoBuilder businesses(String businesses) {
            this.businesses = Integer.parseInt(businesses.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public RouteInfoBuilder residentials(String residentials) {
            this.residentials = Integer.parseInt(residentials.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public RouteInfoBuilder propertyValue(String propertyValue) {
            this.propertyValue = Integer.parseInt(propertyValue.replaceAll("[^\\d.]+", ""));
            return this;
        }

        public RouteInfoBuilder totalDeliveries(String totalDeliveries) {
            this.totalDeliveries = Integer.parseInt(totalDeliveries.replaceAll("[^\\d.]+", ""));
            return this;
        }
    }
}