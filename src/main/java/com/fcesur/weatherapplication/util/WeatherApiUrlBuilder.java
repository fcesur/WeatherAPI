package com.fcesur.weatherapplication.util;

import com.fcesur.weatherapplication.enums.ForecastRangeEnum;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public class WeatherApiUrlBuilder {

    private String apiUrl;

    private String apiKey;

    private ForecastRangeEnum range;

    private String address;


    public String getApiUrl() {

        String forecastRange = "";

        switch (range) {
            case DAILY -> forecastRange = LocalDate.now().toString();
            case WEEKLY -> forecastRange = "next7days";
            case MONTHLY -> forecastRange = "next30days";
            default -> {
            }
        }

        return apiUrl + address + "/" + forecastRange + "?include=days&unitGroup=metric&key=" + apiKey;
    }
}
