package com.ebuytech.svc.easybuy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * account
 *
 * @author
 */
public class Account implements Serializable {
    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 微信openid
     */
    @JsonIgnore
    private String openId;

    /**
     * 手机号
     */
    private String accountNo;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 储值卡ID
     */
    private String valueCardId;

    /**
     * 是否要支付密码 1：是 0：否
     */
    @JsonIgnore
    private Integer paypwdStatus;

    /**
     * 账户支付密码
     */
    @JsonIgnore
    private String paypwd;

    /**
     * 账户余额
     */
    private Integer balance;

    /**
     * 充值次数
     */
    private Integer chargeCount;

    /**
     * 充值金额
     */
    private Integer chargeMoney;

    /**
     * 状态 0:正常 1：冻结
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonIgnore
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getValueCardId() {
        return valueCardId;
    }

    public void setValueCardId(String valueCardId) {
        this.valueCardId = valueCardId;
    }

    public Integer getPaypwdStatus() {
        return paypwdStatus;
    }

    public void setPaypwdStatus(Integer paypwdStatus) {
        this.paypwdStatus = paypwdStatus;
    }

    public String getPaypwd() {
        return paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getChargeCount() {
        return chargeCount;
    }

    public void setChargeCount(Integer chargeCount) {
        this.chargeCount = chargeCount;
    }

    public Integer getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(Integer chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Account other = (Account) that;
        return (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId())) && (this.getOpenId() == null ?
                other.getOpenId() == null :
                this.getOpenId().equals(other.getOpenId())) && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo())) && (
                       this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId())) && (this.getValueCardId() == null ?
                other.getValueCardId() == null :
                this.getValueCardId().equals(other.getValueCardId())) && (this.getPaypwdStatus() == null ? other.getPaypwdStatus() == null : this.getPaypwdStatus().equals(other.getPaypwdStatus()))
               && (this.getPaypwd() == null ? other.getPaypwd() == null : this.getPaypwd().equals(other.getPaypwd())) && (this.getBalance() == null ?
                other.getBalance() == null :
                this.getBalance().equals(other.getBalance())) && (this.getChargeCount() == null ? other.getChargeCount() == null : this.getChargeCount().equals(other.getChargeCount())) && (
                       this.getChargeMoney() == null ? other.getChargeMoney() == null : this.getChargeMoney().equals(other.getChargeMoney())) && (this.getStatus() == null ?
                other.getStatus() == null :
                this.getStatus().equals(other.getStatus())) && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime())) && (
                       this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getValueCardId() == null) ? 0 : getValueCardId().hashCode());
        result = prime * result + ((getPaypwdStatus() == null) ? 0 : getPaypwdStatus().hashCode());
        result = prime * result + ((getPaypwd() == null) ? 0 : getPaypwd().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getChargeCount() == null) ? 0 : getChargeCount().hashCode());
        result = prime * result + ((getChargeMoney() == null) ? 0 : getChargeMoney().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", openId=").append(openId);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", memberId=").append(memberId);
        sb.append(", valueCardId=").append(valueCardId);
        sb.append(", paypwdStatus=").append(paypwdStatus);
        sb.append(", paypwd=").append(paypwd);
        sb.append(", balance=").append(balance);
        sb.append(", chargeCount=").append(chargeCount);
        sb.append(", chargeMoney=").append(chargeMoney);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
