package com.credibanco.tarjetaapp.Utils;

public enum ExceptionsMessages {
    ERROR_NEQUI_02("2-CCSB000013", "La cuenta del usuario se encuentra bloqueada"),
    ;
    private final String code;
    private final String message;
    private ExceptionsMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }/**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
}
