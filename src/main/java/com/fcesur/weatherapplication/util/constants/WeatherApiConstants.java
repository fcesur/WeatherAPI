package com.fcesur.weatherapplication.util.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class WeatherApiConstants {

    public static String WEATHER_API_URL;

    public static String WEATHER_API_KEY;

    public final static String REGEXP_ADDRESS = "[a-zA-Z \\u0080-\\u9fff\\\\/\\-_.,]*";


    @Value("${weather.api.url}")
    public void setApiUrl(String apiUrl) {
        WeatherApiConstants.WEATHER_API_URL = apiUrl;
    }

    @Value("${weather.api.key}")
    public void setApiKey(String apiKey) {
        WeatherApiConstants.WEATHER_API_KEY = apiKey;
    }


}
