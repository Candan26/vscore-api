package com.example.vscoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FraudScoreDetectionResponse implements Serializable {
    private String request_uuid;
    private String type;
    private  Phone phone;
    private FraudScore fraudScore;
}
