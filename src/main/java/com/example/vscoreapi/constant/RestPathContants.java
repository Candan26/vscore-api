package com.example.vscoreapi.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestPathContants {

    public static final String ROOT_PATH = "/v1";
    public static final String ROOT_SCORE_PATH = ROOT_PATH + "/score";
    public static final String PRICE_PATH="/price";
    public static final String PAGE_PATH="/page";
    public static final String IDS_PATH="/ids";
    public static final String IDS_NUMBER_PATH="/number-ids";
    public static final String NEAR_PATH="/near";
    public static final String SORT_PATH="/sort";

    public static final String PATH_SAVE="/save";

    public static final String PUBLIC_ROOT_API = ROOT_PATH + "/**/**";
}
