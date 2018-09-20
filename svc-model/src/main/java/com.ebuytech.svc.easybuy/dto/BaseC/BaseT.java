package com.ebuytech.svc.easybuy.dto.BaseC;

public class BaseT  {
    protected  String  group;
    protected  String  createTime;
    protected  String  chargeOrderSerial;
    protected  String chargeOrderId;
    protected  String AccountId;
    protected  String AccountPhone;
    protected  String chargeType;
    protected  Integer changeValue;
    protected  Integer changeExtra;
    protected   String chargeWay;
    protected   String payAccount;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getChargeOrderSerial() {
        return chargeOrderSerial;
    }

    public void setChargeOrderSerial(String chargeOrderSerial) {
        this.chargeOrderSerial = chargeOrderSerial;
    }

    public String getChargeOrderId() {
        return chargeOrderId;
    }

    public void setChargeOrderId(String chargeOrderId) {
        this.chargeOrderId = chargeOrderId;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public String getAccountPhone() {
        return AccountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        AccountPhone = accountPhone;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
    }

    public Integer getChangeExtra() {
        return changeExtra;
    }

    public void setChangeExtra(Integer changeExtra) {
        this.changeExtra = changeExtra;
    }

    public String getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(String chargeWay) {
        this.chargeWay = chargeWay;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }
}
