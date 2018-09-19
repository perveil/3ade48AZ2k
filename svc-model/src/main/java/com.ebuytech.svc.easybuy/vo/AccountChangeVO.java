package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data public class AccountChangeVO {
    private List accountChangeList;

    //总页数
    private Integer totalPage;

    //总条数
    private Long totalResult;
}
