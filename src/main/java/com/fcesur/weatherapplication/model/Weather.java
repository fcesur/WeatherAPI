package com.fcesur.weatherapplication.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Weather {
    private String datetime;
    private float temp;
    private float feelslike;
    private float tempmin;
    private float tempmax;
    private String conditions;
    private String description;
}
