package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data public class AccountChangeVO {
    // private List accountChangeList;

    //变动原因
    private String changeMemo;

    //创建时间
    private Date createTime;

    //变动值
    private Integer changeValue;

    //过期时间
    private Date finalTime;

    // 充值金额
    // private Integer depositValue;

    // 赠送金额
    // private Integer changeExtra;

    //总页数
    private Integer totalPage;

    //总条数
    private Long totalResult;
}
