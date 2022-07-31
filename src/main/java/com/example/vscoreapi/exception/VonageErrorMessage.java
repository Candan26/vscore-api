package com.example.vscoreapi.exception;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class VonageErrorMessage {
    private String title;
    private String detail;
    private String request_id;
    private String type;
    InvalidParameters invalid_parameters;

    @Data
    @RequiredArgsConstructor
    @Builder
    public class InvalidParameters {
        String name;
        String reason;
    }
}
