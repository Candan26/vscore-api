package com.example.vscoreapi.model.telesign;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class TelesignScoreDto {
    String uuid;
    String reference_id;
    String external_id;
    Status status;
    Numbering numbering;
    PhoneType phone_type;
    Location location;
    Carrier carrier;
    BlockListing blocklisting;
    Risk risk;
}
