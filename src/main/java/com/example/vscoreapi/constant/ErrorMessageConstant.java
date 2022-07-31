package com.example.vscoreapi.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorMessageConstant {
    public static final String TITLE_UNPROCESSABLE_ENTITY = "invalid params";
    public static final String DETAIL_UNPROCESSABLE_ENTITY = "the value of one ore more parameters is invalid";
    public static final String TYPE_UNPROCESSABLE_ENTITY = "https://www.nexmo.com/messages/Errors#InvalidParams";

    public static final String TITLE_INTERNAL_SERVER_ERROR = "Internal error";
    public static final String DETAIL_INTERNAL_SERVER_ERROR = "There was an error processing your request in our platform";
    public static final String TYPE_INTERNAL_SERVER_ERROR = "thttps://www.nexmo.com/messages/Errors#InvalidParams";
}
