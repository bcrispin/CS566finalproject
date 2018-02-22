package com.brennan.cs566;

import com.brennan.cs566.clients.MelissaDataClient;
import com.brennan.cs566.clients.SearchBugClient;
import com.brennan.cs566.models.RouteInfo;
import com.brennan.cs566.models.ZipRoutes;

import java.util.List;

public class Scraper {
    public static void main(String[] args) {
        List<String> zips = SearchBugClient.getZips(48201, 1);
//        SearchBugClient.getZipInfo(zips);
        List<ZipRoutes> routeInfoList = MelissaDataClient.getRouteInfo(zips);
        routeInfoList.size();
    }

}
