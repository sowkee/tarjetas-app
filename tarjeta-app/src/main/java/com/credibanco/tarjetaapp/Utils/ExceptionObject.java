package com.credibanco.tarjetaapp.Utils;

public class ExceptionObject extends Throwable {

    private String code;
    private  String message;


    public ExceptionObject(ExceptionsMessages exceptionMessage) {
        this.code = exceptionMessage.getCode();
        this.message = exceptionMessage.getMessage();
    }

    public ExceptionObject(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
