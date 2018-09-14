package com.ebuytech.svc.easybuy.dto;

import com.ebuytech.svc.easybuy.dto.BaseC.Base;

public class Daily extends Base {
    @Override
    public String toString() {
        return "Daily{" +
                "group='" + group + '\'' +
                ", changeValue=" + changeValue +
                ", totalNum=" + totalNum +
                ", extraTotalValue=" + extraTotalValue +
                ", changeTotalValue=" + changeTotalValue +
                '}';
    }
}
