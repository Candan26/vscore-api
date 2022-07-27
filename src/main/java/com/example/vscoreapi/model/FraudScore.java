package com.example.vscoreapi.model;

import lombok.*;

import java.io.Serializable;


@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class FraudScore implements Serializable {
    private String risk_score;
    private String label;
    private String risk_recommendation;
}
