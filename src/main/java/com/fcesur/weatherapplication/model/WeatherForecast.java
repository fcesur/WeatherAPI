package com.fcesur.weatherapplication.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherForecast {
    private String address;
    private List<Weather> days;
}
