package com.javadev.springbootmongodb.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime localDateTime;
    private String httpStatus;
    private String message;

    public ErrorResponse(LocalDateTime localDateTime, String httpStatus, String message) {
        this.localDateTime = localDateTime;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
