package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 传递给前端查询的用户列表信息
 * Created by Eric3 on 2018/9/14.
 */
@Data public class AccountVO {

    private List accountList;
//
//    //创建时间
//    private Date createTime;
//
//    //会员ID
//    private String memberId;
//
//    //手机号
//    private String accountNo;
//
//    //储值卡账号
//    private String valueCardId;
//
//    //充值次数
//    private Integer chargeCount;
//
//    //充值金额
//    private Integer chargeMoney;
//
//    //账户余额
//    private Integer balance;
//
//    //账户状态 0正常
//    private Integer status;

    //总页数
    private Integer totalPage;

    //总条数
    private Long totalResult;
}
