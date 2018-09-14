package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * account_change
 *
 * @author
 */
public class AccountChange implements Serializable {
    /**
     * 主键
     */
    private String accountChangeId;

    /**
     * 变动原因（如实体店消费、在线充值等）
     */
    private String changeMemo;

    /**
     * 变动类型：0不变，1增加，2减少
     */
    private String changeType;

    /**
     * 变化值
     */
    private Integer changeValue;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 门店id
     */
    private String storeId;

    /**
     * 变动后余额
     */
    private Integer balance;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getAccountChangeId() {
        return accountChangeId;
    }

    public void setAccountChangeId(String accountChangeId) {
        this.accountChangeId = accountChangeId;
    }

    public String getChangeMemo() {
        return changeMemo;
    }

    public void setChangeMemo(String changeMemo) {
        this.changeMemo = changeMemo;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
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

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
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
        AccountChange other = (AccountChange) that;
        return (this.getAccountChangeId() == null ? other.getAccountChangeId() == null : this.getAccountChangeId().equals(other.getAccountChangeId())) && (this.getChangeMemo() == null ?
                other.getChangeMemo() == null :
                this.getChangeMemo().equals(other.getChangeMemo())) && (this.getChangeType() == null ? other.getChangeType() == null : this.getChangeType().equals(other.getChangeType())) && (
                       this.getChangeValue() == null ? other.getChangeValue() == null : this.getChangeValue().equals(other.getChangeValue())) && (this.getMemberId() == null ?
                other.getMemberId() == null :
                this.getMemberId().equals(other.getMemberId())) && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId())) && (
                       this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId())) && (this.getBalance() == null ?
                other.getBalance() == null :
                this.getBalance().equals(other.getBalance())) && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime())) && (
                       this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountChangeId() == null) ? 0 : getAccountChangeId().hashCode());
        result = prime * result + ((getChangeMemo() == null) ? 0 : getChangeMemo().hashCode());
        result = prime * result + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        result = prime * result + ((getChangeValue() == null) ? 0 : getChangeValue().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountChangeId=").append(accountChangeId);
        sb.append(", changeMemo=").append(changeMemo);
        sb.append(", changeType=").append(changeType);
        sb.append(", changeValue=").append(changeValue);
        sb.append(", memberId=").append(memberId);
        sb.append(", accountId=").append(accountId);
        sb.append(", storeId=").append(storeId);
        sb.append(", balance=").append(balance);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
