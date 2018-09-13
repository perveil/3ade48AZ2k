package com.ebuytech.svc.easybuy.exception;


import com.ebuytech.svc.easybuy.enums.ResultEnums;

public class AdminException extends RuntimeException {

    private Integer code;

    public AdminException(ResultEnums resultEnums){
        super(resultEnums.getMessage());
        this.code=resultEnums.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
