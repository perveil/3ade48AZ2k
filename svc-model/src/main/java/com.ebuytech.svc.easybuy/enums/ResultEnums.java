package com.ebuytech.svc.easybuy.enums;

public enum ResultEnums {
    UNKNOWN_ERROR(-1, "未知错误"),

    SUCCESS(0, "成功"),

    TEST_FAIL(101, "測試失敗"),

    USER_NOTINDB(201, "登陆失败，登陆信息不正确"),

    USER_CODE_NULL(102, "用户code为空"),

    MEMBER_NULL(103,"会员为空"),

    PAGENUM_ERROR(104,"页码错误"),

    REGISER_MEMBER_ERROR(105,"注册会员失败"),

    REQUIRE_SESSIONCODE(106,"缺少sessionCode"),

    SESSIONCODE_EXPIRED(107,"sessionCode已过期"),

    PAY_FAIL(108,"支付失败,请稍后重试"),

    WXPAY_CALLBACK_ANOMALY(109,"微信回调结果异常"),

    QUERY_PAGE_NOT_RIGHT(202, "查询页码不正确"),

    QUERY_USER_NULL(203,"查询用户不存在"),

    ACCOUNT_FREEZEN(204,"该账户已经冻结"),

    ACCOUNT_FREEZE_NULL(205,"被冻结用户不存在"),

    BALANCE_NEGATIVE(206, "添加的金额不能为负"),

    ID_OR_PASSWORD_NOT_RIGHT(207,"用户ID或者密码错误"),
    ;

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
