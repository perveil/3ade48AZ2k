package com.ebuytech.svc.easybuy.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data public class AccountChangeDetailVO {
    /**
     * 变动原因（如实体店消费、在线充值等）
     */
    private String changeMemo;

    /**
     * 变化值
     */
    private Integer changeValue;

    /**
     * 交易状态 0：成功 1：失败 2：待付款 3：已退款
     */
    private Integer status;

    // 赠送金额
    private Integer changeExtra;

    // 付款方式
    private String changeType;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") private Date createTime;

    private String accountChangeId;

}
