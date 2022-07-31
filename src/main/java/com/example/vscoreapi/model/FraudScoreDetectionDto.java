package com.example.vscoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FraudScoreDetectionDto implements Serializable {
    private String type;
    private String value;
    private String fraud_score;
}
