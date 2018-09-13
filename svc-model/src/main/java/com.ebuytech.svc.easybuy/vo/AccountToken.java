package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

@Data
public class AccountToken {

    private String accountId;

    private String openId;

    private String sessionCode;
}
