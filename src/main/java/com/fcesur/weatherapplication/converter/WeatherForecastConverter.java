package com.fcesur.weatherapplication.converter;

import com.fcesur.weatherapplication.dto.WeatherDto;
import com.fcesur.weatherapplication.dto.WeatherForecastDto;
import com.fcesur.weatherapplication.model.WeatherForecast;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class WeatherForecastConverter {

    private final WeatherConverter weatherConverter;

    public WeatherForecastDto toDto(WeatherForecast forecast) {

        List<WeatherDto> weatherDTOs = new ArrayList<>();

        forecast.getDays().forEach(weather ->
                weatherDTOs.add(weatherConverter.toDto(weather))
        );


        return new WeatherForecastDto(forecast.getAddress(), weatherDTOs);
    }
}
