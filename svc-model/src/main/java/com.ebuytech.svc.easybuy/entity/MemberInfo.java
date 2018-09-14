package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * member_info
 *
 * @author
 */
public class MemberInfo implements Serializable {
    /**
     * 主键
     */
    private String memberInfoId;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 会员信息项，如手机、地址、姓名等
     */
    private String infoKey;

    /**
     * 会员信息值
     */
    private String infoValue;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getMemberInfoId() {
        return memberInfoId;
    }

    public void setMemberInfoId(String memberInfoId) {
        this.memberInfoId = memberInfoId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getInfoKey() {
        return infoKey;
    }

    public void setInfoKey(String infoKey) {
        this.infoKey = infoKey;
    }

    public String getInfoValue() {
        return infoValue;
    }

    public void setInfoValue(String infoValue) {
        this.infoValue = infoValue;
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
        MemberInfo other = (MemberInfo) that;
        return (this.getMemberInfoId() == null ? other.getMemberInfoId() == null : this.getMemberInfoId().equals(other.getMemberInfoId())) && (this.getMemberId() == null ?
                other.getMemberId() == null :
                this.getMemberId().equals(other.getMemberId())) && (this.getInfoKey() == null ? other.getInfoKey() == null : this.getInfoKey().equals(other.getInfoKey())) && (
                       this.getInfoValue() == null ? other.getInfoValue() == null : this.getInfoValue().equals(other.getInfoValue())) && (this.getCreateTime() == null ?
                other.getCreateTime() == null :
                this.getCreateTime().equals(other.getCreateTime())) && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberInfoId() == null) ? 0 : getMemberInfoId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getInfoKey() == null) ? 0 : getInfoKey().hashCode());
        result = prime * result + ((getInfoValue() == null) ? 0 : getInfoValue().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberInfoId=").append(memberInfoId);
        sb.append(", memberId=").append(memberId);
        sb.append(", infoKey=").append(infoKey);
        sb.append(", infoValue=").append(infoValue);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
