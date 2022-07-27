package com.example.vscoreapi.model;

import lombok.*;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Phone  implements Serializable {
    private String phone;
    private String carrier;
    private String type;
}
