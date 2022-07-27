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
public class PhoneScoreDto  implements Serializable {
    private String request_uuid;
    private String type;
    private  Phone phone;
    private FraudScore fraudScore;
}
