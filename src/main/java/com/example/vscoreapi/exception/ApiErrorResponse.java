package com.example.vscoreapi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ApiErrorResponse {
    private Date timestamp;
    int errorCode;
    VonageErrorMessage errorMessage;
}