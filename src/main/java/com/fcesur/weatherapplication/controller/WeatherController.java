package com.fcesur.weatherapplication.controller;

import com.fcesur.weatherapplication.dto.WeatherForecastDto;
import com.fcesur.weatherapplication.service.WeatherService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/v1/weather")
@Validated
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @Tag(name = "Get Daily Weather")
    @GetMapping("/daily/{address}")
    public ResponseEntity<WeatherForecastDto> getDailyWeather(@PathVariable @NotBlank String address) {
        return ResponseEntity.ok(weatherService.getDailyWeatherForecast(address));
    }

    @Tag(name = "Get Weekly Weather")
    @GetMapping("/weekly/{address}")
    public ResponseEntity<WeatherForecastDto> getWeeklyWeather(@PathVariable @NotBlank String address) {
        return ResponseEntity.ok(weatherService.getWeeklyWeatherForecast(address));
    }

    @Tag(name = "Get Monthly Weather")
    @GetMapping("/monthly/{address}")
    public ResponseEntity<WeatherForecastDto> getMonthlyWeather(@PathVariable @NotBlank String address) {
        return ResponseEntity.ok(weatherService.getMonthlyWeatherForecast(address));
    }


}
