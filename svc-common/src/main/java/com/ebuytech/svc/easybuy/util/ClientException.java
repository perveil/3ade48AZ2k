package com.ebuytech.svc.easybuy.util;

import lombok.Getter;

@Getter
public class ClientException extends RuntimeException {
    private int code;

    public ClientException(ClientEnums clientEnums) {
        super(clientEnums.getMessage());
        this.code = clientEnums.getCode();
    }
}
