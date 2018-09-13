package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * account_charge
 * @author 
 */
public class AccountCharge implements Serializable {
    /**
     * 主键
     */
    private String accountChargeId;

    /**
     * 充值金额
     */
    private Integer changeValue;

    /**
     * 赠送金额
     */
    private Integer changeExtra;

    /**
     * 变动原因
     */
    private String changeMemo;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 交易流水号
     */
    private String chargeOrderSerial;

    /**
     * 充值订单号
     */
    private String chargeOrderId;

    /**
     * 充值类型
     */
    private String chargeType;

    /**
     * 支付渠道
     */
    private String chargeWay;

    /**
     * 支付流水号
     */
    private String paySerial;

    /**
     * 支付账号
     */
    private String payAccount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getAccountChargeId() {
        return accountChargeId;
    }

    public void setAccountChargeId(String accountChargeId) {
        this.accountChargeId = accountChargeId;
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

    public String getChangeMemo() {
        return changeMemo;
    }

    public void setChangeMemo(String changeMemo) {
        this.changeMemo = changeMemo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(String chargeWay) {
        this.chargeWay = chargeWay;
    }

    public String getPaySerial() {
        return paySerial;
    }

    public void setPaySerial(String paySerial) {
        this.paySerial = paySerial;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AccountCharge other = (AccountCharge) that;
        return (this.getAccountChargeId() == null ? other.getAccountChargeId() == null : this.getAccountChargeId().equals(other.getAccountChargeId()))
            && (this.getChangeValue() == null ? other.getChangeValue() == null : this.getChangeValue().equals(other.getChangeValue()))
            && (this.getChangeExtra() == null ? other.getChangeExtra() == null : this.getChangeExtra().equals(other.getChangeExtra()))
            && (this.getChangeMemo() == null ? other.getChangeMemo() == null : this.getChangeMemo().equals(other.getChangeMemo()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getChargeOrderSerial() == null ? other.getChargeOrderSerial() == null : this.getChargeOrderSerial().equals(other.getChargeOrderSerial()))
            && (this.getChargeOrderId() == null ? other.getChargeOrderId() == null : this.getChargeOrderId().equals(other.getChargeOrderId()))
            && (this.getChargeType() == null ? other.getChargeType() == null : this.getChargeType().equals(other.getChargeType()))
            && (this.getChargeWay() == null ? other.getChargeWay() == null : this.getChargeWay().equals(other.getChargeWay()))
            && (this.getPaySerial() == null ? other.getPaySerial() == null : this.getPaySerial().equals(other.getPaySerial()))
            && (this.getPayAccount() == null ? other.getPayAccount() == null : this.getPayAccount().equals(other.getPayAccount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountChargeId() == null) ? 0 : getAccountChargeId().hashCode());
        result = prime * result + ((getChangeValue() == null) ? 0 : getChangeValue().hashCode());
        result = prime * result + ((getChangeExtra() == null) ? 0 : getChangeExtra().hashCode());
        result = prime * result + ((getChangeMemo() == null) ? 0 : getChangeMemo().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getChargeOrderSerial() == null) ? 0 : getChargeOrderSerial().hashCode());
        result = prime * result + ((getChargeOrderId() == null) ? 0 : getChargeOrderId().hashCode());
        result = prime * result + ((getChargeType() == null) ? 0 : getChargeType().hashCode());
        result = prime * result + ((getChargeWay() == null) ? 0 : getChargeWay().hashCode());
        result = prime * result + ((getPaySerial() == null) ? 0 : getPaySerial().hashCode());
        result = prime * result + ((getPayAccount() == null) ? 0 : getPayAccount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountChargeId=").append(accountChargeId);
        sb.append(", changeValue=").append(changeValue);
        sb.append(", changeExtra=").append(changeExtra);
        sb.append(", changeMemo=").append(changeMemo);
        sb.append(", memberId=").append(memberId);
        sb.append(", accountId=").append(accountId);
        sb.append(", chargeOrderSerial=").append(chargeOrderSerial);
        sb.append(", chargeOrderId=").append(chargeOrderId);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", chargeWay=").append(chargeWay);
        sb.append(", paySerial=").append(paySerial);
        sb.append(", payAccount=").append(payAccount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}