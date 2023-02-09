package com.fcesur.weatherapplication.service;

import com.fcesur.weatherapplication.dto.WeatherForecastDto;


public interface WeatherService {

    WeatherForecastDto getDailyWeatherForecast(String address);

    WeatherForecastDto getWeeklyWeatherForecast(String address);

    WeatherForecastDto getMonthlyWeatherForecast(String address);


}
