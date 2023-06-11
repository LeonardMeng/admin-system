package org.mengsoft.adminbackend.common.responseutils.enums;



public enum ResponseCode {

    SUCCESS(200, "Success"),
    USER_NOT_EXSITED(20001, "User is not exsited!"),
    USER_PASSWORD_ERROR(20002, "User password is not correct!"),
    EMAIL_HAS_EXSITED(20003, "Email is already exsited!"),
    PARAM_IS_INVALID(20002, "Param is invalid."),
    TOKEN_IS_REQUIRED(40001, "Token is required."),
    SYSTEM_ERROR(10000, "System Error, Please Contact Admin.");


    private Integer code;
    private String message;

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
