package com.ebuytech.svc.easybuy.vo;

import com.ebuytech.svc.easybuy.entity.Charge;
import lombok.Data;

import java.util.Date;

/**
 *
 *charge表单列表
 * Created by HYS on 2018/9/17.
 */
@Data
public class ChargeVO {

    private Integer chargeId;

    private Integer actId;

    private Integer chargeMoney;

    private Integer isValid;

    private String  cntInfo;

    private Date createTime;

}
