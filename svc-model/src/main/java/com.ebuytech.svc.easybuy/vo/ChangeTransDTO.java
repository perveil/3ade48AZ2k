package com.ebuytech.svc.easybuy.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by Eric3 on 2018/9/18.
 */
@Data
public class ChangeTransDTO {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") private Date createTime;

    private String accountChangeId;

    private String valueCardId;

    /**
     * 手机号
     */
    private String accountNo;

    /**
     * 交易类型（如实体店消费、在线充值等）
     */
    private String changeMemo;

    /**
     * 变化值 交易金额
     */
    private Integer changeValue;

    /**
     * 支付渠道
     */
    private String chargeWay;

    /**
     * 交易状态 0：成功 1：失败 2：待付款 3：已退款
     */
    private Integer status;
}
