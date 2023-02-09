package com.fcesur.weatherapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WeatherDto {
    private String datetime;
    private double temp;
    private float feelslike;
    private float tempmin;
    private float tempmax;
    private String conditions;
    private String description;
}
