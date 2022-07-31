package com.example.vscoreapi.exception;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;

import static com.example.vscoreapi.constant.ErrorMessageConstant.*;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {

    private final MessageSource messageSource;

    @ExceptionHandler(CustomException.class)
    public void handleCustomException(HttpServletResponse res, CustomException ex) throws IOException {
        String errorCode = UUID.randomUUID().toString();
        log.error(errorCode);
        log.error(Objects.toString(ex));
        res.sendError(ex.getHttpStatus().value(), ex.getMessage());
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleNoSuchElementException(String requestId, NoSuchElementException ex) {
        String errorCode = UUID.randomUUID().toString();
        log.error(errorCode);
        log.error(Objects.toString(ex));
        VonageErrorMessage vonageErrorMessage = VonageErrorMessage.
                builder().
                title(TITLE_UNPROCESSABLE_ENTITY).
                detail(DETAIL_UNPROCESSABLE_ENTITY).
                request_id(requestId).
                type(TYPE_UNPROCESSABLE_ENTITY).
                invalid_parameters(InvalidParameters.builder().name("value").reason("invalid value").build()).
                build();
        return new ApiErrorResponse(new Date(),HttpStatus.UNPROCESSABLE_ENTITY.value(),vonageErrorMessage);
    }
/*
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ApiErrorResponse handleUnAuthorizedException(String  requestId, BusinessException ex) {
        return getApiErrorResponse(requestId, ex);
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
    public ApiErrorResponse handlePaymentRequiredException(String  requestId, BusinessException ex) {
        return getApiErrorResponse(requestId, ex);
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrorResponse handleNotFoundException(String  requestId, BusinessException ex) {
        return getApiErrorResponse(requestId, ex);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public ApiErrorResponse handleTooManyRequestsException(String requestId, NoSuchElementException ex) {
        String errorCode = UUID.randomUUID().toString();
        log.error(errorCode);
        log.error(Objects.toString(ex));
        VonageErrorMessage vonageErrorMessage = VonageErrorMessage.
                builder().
                title("Rate Limit Hit").
                detail("Please wait, then retry your request").
                request_id(requestId).
                type("https://www.nexmo.com/messages/Errors#InvalidParams").
                invalid_parameters(null).
                build();
        return new ApiErrorResponse(new Date(),HttpStatus.INTERNAL_SERVER_ERROR.value(),vonageErrorMessage);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiErrorResponse handleInternalServerErrorException(String requestId, BusinessException ex) {
        return getApiErrorResponse(requestId, ex);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ApiErrorResponse handleService_UnavailableErrorException(String requestId, BusinessException ex) {
        return getApiErrorResponse(requestId, ex);
    }

    private ApiErrorResponse getApiErrorResponse(String requestId, BusinessException ex) {
        String errorCode = UUID.randomUUID().toString();
        log.error(errorCode);
        log.error(Objects.toString(ex));
        VonageErrorMessage vonageErrorMessage = VonageErrorMessage.
                builder().
                title(TITLE_INTERNAL_SERVER_ERROR).
                detail(DETAIL_INTERNAL_SERVER_ERROR).
                request_id(requestId).
                type(TYPE_INTERNAL_SERVER_ERROR).
                invalid_parameters(null).
                build();
        return new ApiErrorResponse(new Date(), HttpStatus.INTERNAL_SERVER_ERROR.value(),vonageErrorMessage);
    }

 */
}