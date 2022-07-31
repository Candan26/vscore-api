package com.example.vscoreapi.model.telesign;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Numbering {
    Original original;
    Cleansing cleansing;


    @Data
    @RequiredArgsConstructor
    private class Original {
        String complete_phone_number;
        String country_code;
        String phone_number;
    }

    @Data
    @RequiredArgsConstructor
    private class Cleansing {
        Call call;
        Sms sms;

        @Data
        @RequiredArgsConstructor
        private class Call {
            String country_code;
            String phone_number;
            Long cleansed_code;
            Long min_length;
            Long max_length;
        }

        @Data
        @RequiredArgsConstructor
        private class Sms {
            String country_code;
            String phone_number;
            Long cleansed_code;
            Long min_length;
            Long max_length;
        }
    }


}
