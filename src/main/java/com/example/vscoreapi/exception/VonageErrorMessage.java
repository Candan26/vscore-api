package com.example.vscoreapi.exception;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@RequiredArgsConstructor
public class VonageErrorMessage {
    private String title;
    private String detail;
    private String request_id;
    private String type;
    private InvalidParameters invalid_parameters;

}
