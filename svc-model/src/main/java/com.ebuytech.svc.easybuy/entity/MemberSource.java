package com.ebuytech.svc.easybuy.entity;

import java.io.Serializable;

/**
 * member_source
 * @author 
 */
public class MemberSource implements Serializable {
    /**
     * 主键
     */
    private String memberSourceId;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 来源ID
     */
    private String sourceId;

    /**
     * 会员来源,WECHAT、ALIPAY、MERCHANT
     */
    private String source;

    private static final long serialVersionUID = 1L;

    public String getMemberSourceId() {
        return memberSourceId;
    }

    public void setMemberSourceId(String memberSourceId) {
        this.memberSourceId = memberSourceId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
        MemberSource other = (MemberSource) that;
        return (this.getMemberSourceId() == null ? other.getMemberSourceId() == null : this.getMemberSourceId().equals(other.getMemberSourceId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getSourceId() == null ? other.getSourceId() == null : this.getSourceId().equals(other.getSourceId()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberSourceId() == null) ? 0 : getMemberSourceId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberSourceId=").append(memberSourceId);
        sb.append(", memberId=").append(memberId);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", source=").append(source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}