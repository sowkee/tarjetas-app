package com.credibanco.tarjetaapp.DTO;

import com.credibanco.tarjetaapp.Utils.ExceptionObject;
import com.credibanco.tarjetaapp.Utils.ExceptionsMessages;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultDto {
    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    public ResultDto(ExceptionObject E) {
        this.code=E.getCode();
        this.message=E.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultDto(ExceptionsMessages exceptionMessage) {
        this.code = exceptionMessage.getCode();
        this.message = exceptionMessage.getMessage();
    }

    public ResultDto() {
    }
}
