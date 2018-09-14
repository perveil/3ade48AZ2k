package com.ebuytech.svc.easybuy.enums;

public enum ResultEnums {
    UNKNOWN_ERROR(-1, "未知错误"), SUCCESS(0, "成功"), TEST_FAIL(101, "測試失敗"), USER_CODE_NULL(102, "用户code为空"),INVALID_CODE(103,"非法code"),MEMBER_NULL(104,"不存在该会员");

    private Integer code;
    private String  message;

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
