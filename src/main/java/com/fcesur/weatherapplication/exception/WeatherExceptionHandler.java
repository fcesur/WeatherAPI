package com.fcesur.weatherapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;


@RestControllerAdvice
public class WeatherExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage addressHandler(HttpClientErrorException exception, WebRequest request) {
        return new ErrorMessage(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false)
        );
    }


}
