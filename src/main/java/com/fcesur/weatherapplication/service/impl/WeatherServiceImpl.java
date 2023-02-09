package com.fcesur.weatherapplication.service.impl;

import com.fcesur.weatherapplication.converter.WeatherForecastConverter;
import com.fcesur.weatherapplication.dto.WeatherForecastDto;
import com.fcesur.weatherapplication.enums.ForecastRangeEnum;
import com.fcesur.weatherapplication.model.WeatherForecast;
import com.fcesur.weatherapplication.service.WeatherService;
import com.fcesur.weatherapplication.util.WeatherApiUrlBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.fcesur.weatherapplication.util.constants.WeatherApiConstants.WEATHER_API_KEY;
import static com.fcesur.weatherapplication.util.constants.WeatherApiConstants.WEATHER_API_URL;


@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final RestTemplate restTemplate;
    private final WeatherForecastConverter converter;

    @Override
    public WeatherForecastDto getDailyWeatherForecast(String address) {

        String apiUrl = WeatherApiUrlBuilder.builder()
                .apiUrl(WEATHER_API_URL)
                .apiKey(WEATHER_API_KEY)
                .range(ForecastRangeEnum.DAILY)
                .address(address)
                .build()
                .getApiUrl();

        return converter.toDto(restTemplate.getForObject(apiUrl, WeatherForecast.class));
    }

    @Override
    public WeatherForecastDto getWeeklyWeatherForecast(String address) {
        String apiUrl = WeatherApiUrlBuilder.builder()
                .apiUrl(WEATHER_API_URL)
                .apiKey(WEATHER_API_KEY)
                .range(ForecastRangeEnum.WEEKLY)
                .address(address)
                .build()
                .getApiUrl();

        return converter.toDto(restTemplate.getForObject(apiUrl, WeatherForecast.class));
    }

    @Override
    public WeatherForecastDto getMonthlyWeatherForecast(String address) {
        String apiUrl = WeatherApiUrlBuilder.builder()
                .apiUrl(WEATHER_API_URL)
                .apiKey(WEATHER_API_KEY)
                .range(ForecastRangeEnum.MONTHLY)
                .address(address)
                .build()
                .getApiUrl();

        return converter.toDto(restTemplate.getForObject(apiUrl, WeatherForecast.class));
    }

}
