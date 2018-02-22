package com.brennan.cs566.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class ZipRoutes {
    private String zip;
    @Singular
    @Setter
    private List<RouteInfo> routes;
}
