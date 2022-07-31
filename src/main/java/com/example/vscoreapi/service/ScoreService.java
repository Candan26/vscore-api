package com.example.vscoreapi.service;

import com.example.vscoreapi.config.InfoServiceConfig;
import com.example.vscoreapi.model.FraudScoreDetectionDto;
import com.example.vscoreapi.model.telesign.TelesignScoreDto;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScoreService {

    //String customerId = "D3453F96-B9A8-4C33-85ED-C2845C0E2772";
    //String apiKey = "OKxhXMpIBTNzoMujlNNY7qPUZNxWyWMlesBPZSSbqon3UoMPYeUdP19ltAlv9lBpdu+bbrlSf3BuOSdVlN1H5g==";
    //String phoneNumber = "905544117123";
    //String accountLifecycleEvent = "create";

    private final InfoServiceConfig infoServiceConfig;

    public TelesignScoreDto checkScore(FraudScoreDetectionDto dto) throws GeneralSecurityException, IOException {
/*
            ScoreClient scoreClient = new ScoreClient(infoServiceConfig.getCustomerId(), infoServiceConfig.getApiKey());
            RestClient.TelesignResponse telesignResponse = scoreClient.score(dto.getValue(), infoServiceConfig.getAccountLifecycleEvent(), null);
*/
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"reference_id\":\"3609517E5F900B1C9006E691287D4C0E\",\"external_id\":null,\"status\":{\"updated_on\":\"2022-07-31T13:08:50.323998Z\",\"code\":300,\"description\":\"Transaction successfully completed\"},\"numbering\":{\"original\":{\"complete_phone_number\":\"905544117123\",\"country_code\":\"90\",\"phone_number\":\"5544117123\"},\"cleansing\":{\"call\":{\"country_code\":\"90\",\"phone_number\":\"5544117123\",\"cleansed_code\":100,\"min_length\":10,\"max_length\":10},\"sms\":{\"country_code\":\"90\",\"phone_number\":\"5544117123\",\"cleansed_code\":100,\"min_length\":10,\"max_length\":10}}},\"phone_type\":{\"code\":\"2\",\"description\":\"MOBILE\"},\"location\":{\"city\":\"Countrywide\",\"state\":null,\"zip\":null,\"metro_code\":null,\"county\":null,\"country\":{\"name\":\"Turkey\",\"iso2\":\"TR\",\"iso3\":\"TUR\"},\"coordinates\":{\"latitude\":null,\"longitude\":null},\"time_zone\":{\"name\":null,\"utc_offset_min\":\"+2\",\"utc_offset_max\":\"+2\"}},\"carrier\":{\"name\":\"AVEA\"},\"blocklisting\":{\"blocked\":false,\"block_code\":0,\"block_description\":\"Not blocked\"},\"risk\":{\"level\":\"medium-low\",\"recommendation\":\"allow\",\"score\":235}}";
            /*
            TelesignScoreDto telesignScoreDto = mapper.treeToValue(mapper.readTree(telesignResponse.json.toString()), TelesignScoreDto.class);
            if (telesignResponse.ok) {
               System.out.println(telesignScoreDto);
            }
            String jsonString400 = "{  \"reference_id\": \"0123456789ABCDEF0123456789ABCDEF\",  \"external_id\": \"CustomExternalID7349\",  \"status\": {    \"updated_on\": \"2017-02-01T00:33:34.860418Z\",    \"code\": 10032,    \"description\": \"Request blocked due to this number appearing on a TeleSign blacklist.\"  }}";
          */
        JsonNode jsonNode = mapper.readTree(jsonString);
        TelesignScoreDto telesignScoreDto = mapper.treeToValue(jsonNode, TelesignScoreDto.class);
        log.info(String.valueOf(telesignScoreDto));
        telesignScoreDto.setUuid(UUID.randomUUID().toString());
        return telesignScoreDto;
    }
}
