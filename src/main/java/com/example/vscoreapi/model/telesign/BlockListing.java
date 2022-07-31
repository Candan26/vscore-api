package com.example.vscoreapi.model.telesign;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BlockListing {
    Boolean blocked;
    String block_code;
    String block_description;
}
