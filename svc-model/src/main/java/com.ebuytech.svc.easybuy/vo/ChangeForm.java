package com.ebuytech.svc.easybuy.vo;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

/**
 * Created by Eric3 on 2018/9/18.
 */
@Data
@Getter
public class ChangeForm {

    private String timeType;//交易时间

    private Date startTime;//开始交易时间

    private Date endTime;//结束交易时间

    private String type;//交易类型

    private String phone;//手机号

    private String valueCardId;//储值卡卡号

    private String accountChangeId;//订单号

}
