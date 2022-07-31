package com.example.vscoreapi.model.telesign;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Numbering {
    private Original original;
    private Cleansing cleansing;



    @Data
    @RequiredArgsConstructor
    public class Original {
        private String complete_phone_number;
        private String country_code;
        private String phone_number;
    }

    @Data
    @RequiredArgsConstructor
    private class Cleansing {
        private Call call;
        private Sms sms;

        @Data
        @RequiredArgsConstructor
        private class Call {
            private String country_code;
            private String phone_number;
            private Long cleansed_code;
            private Long min_length;
            private Long max_length;
        }

        @Data
        @RequiredArgsConstructor
        private class Sms {
            private String country_code;
            private String phone_number;
            private Long cleansed_code;
            private Long min_length;
            private Long max_length;
        }
    }


}
