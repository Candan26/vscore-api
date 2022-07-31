package com.example.vscoreapi.exception;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public  class InvalidParameters implements Serializable {
    String name;
    String reason;
}