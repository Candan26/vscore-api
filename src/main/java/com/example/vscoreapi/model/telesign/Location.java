package com.example.vscoreapi.model.telesign;

import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data
@RequiredArgsConstructor
public class Location {
    String city;
    String state;
    String zip;
    String metro_code;
    String county;
    Country country;
    Coordinates coordinates;
    TimeZone time_zone;

    @Data
    @RequiredArgsConstructor
    private class Country {
        String name;
        String iso2;
        String iso3;
    }

    @Data
    @RequiredArgsConstructor
    private class Coordinates {
        String latitude;
        String longitude;
    }

    @Data
    @RequiredArgsConstructor
    private class TimeZone {
        String name;
        String utc_offset_min;
        String utc_offset_max;
    }
}
