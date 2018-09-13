package com.ebuytech.svc.easybuy.util;

import lombok.Getter;

@Getter
public enum ClientEnums {
    SUCCESS(0,"成功"),
    FAILED(-1,"系统异常"),
    ADMIN_CODE_NULL(101,"code不能为空"),

    ;

    private int code;

    private String message;

    ClientEnums(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
