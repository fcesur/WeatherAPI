package com.fcesur.weatherapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class WeatherForecastDto {
    private String address;
    private List<WeatherDto> days;
}
