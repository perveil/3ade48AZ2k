package com.ebuytech.svc.easybuy.enums;

public enum ResultEnums {
    UNKNOWN_ERROR(-1,"未知错误"),

    SUCCESS(0,"成功"),

    TEST_FAIL(101,"測試失敗"),

    USER_NOTINDB(201,"登陆失败，登陆信息不正确"),
    ;

    private Integer code;
    private String message;

    ResultEnums(Integer code, String message) {
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
