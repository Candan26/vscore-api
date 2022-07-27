package com.example.vscoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FraudScoreDetectionRequest implements Serializable {
    private String type;
    private String value;
    private String fraud_score;
}
