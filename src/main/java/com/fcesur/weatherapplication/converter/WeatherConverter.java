package com.fcesur.weatherapplication.converter;

import com.fcesur.weatherapplication.dto.WeatherDto;
import com.fcesur.weatherapplication.model.Weather;

import org.springframework.stereotype.Component;

@Component
public class WeatherConverter {

    public WeatherDto toDto(Weather weather) {
        return new WeatherDto(
                weather.getDatetime(),
                weather.getTemp(),
                weather.getFeelslike(),
                weather.getTempmin(),
                weather.getTempmax(),
                weather.getConditions(),
                weather.getDescription()
        );
    }

}
