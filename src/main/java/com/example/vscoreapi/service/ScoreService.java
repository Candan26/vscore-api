package com.example.vscoreapi.service;

import com.example.vscoreapi.mapper.ScoreMapper;
import com.example.vscoreapi.model.FraudScoreDetectionRequest;
import com.example.vscoreapi.model.PhoneScoreDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telesign.RestClient;
import com.telesign.ScoreClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScoreService {

    String customerId = "D3453F96-B9A8-4C33-85ED-C2845C0E2772";
    String apiKey = "jOjsPFsS927wzLNuMxXbpynyK6+agxIvgQ09P9xVDRq4EjqOH1bhuTUw6pNXhFBedz6zgcYH9VSbtySqwhaC/g==";
    //String phoneNumber = "905544117123";
    String accountLifecycleEvent = "create";

    public PhoneScoreDto checkScore(PhoneScoreDto dto) {
        try {
            ScoreClient scoreClient = new ScoreClient(customerId, apiKey);
            RestClient.TelesignResponse telesignResponse = scoreClient.score(dto.getPhone().getPhone(), accountLifecycleEvent, null);
            if (telesignResponse.ok) {
                System.out.println(String.format("Phone number %s has a '%s' risk level and the recommendation is to '%s' the transaction.",
                dto.getPhone().getPhone(),
                telesignResponse.json.getAsJsonObject("risk").get("level").getAsString(),
                telesignResponse.json.getAsJsonObject("risk").get("recommendation").getAsString()));
                ObjectMapper mapper = new ObjectMapper();
                // Java object to JSON file
                PhoneScoreDto phoneScoreDto1 =  mapper.readValue(telesignResponse.json.getAsString(),PhoneScoreDto.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}
