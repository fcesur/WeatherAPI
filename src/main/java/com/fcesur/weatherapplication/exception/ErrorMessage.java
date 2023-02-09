package com.fcesur.weatherapplication.exception;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private Date timestamp;
    private String message;
    private String description;
}
