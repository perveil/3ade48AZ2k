package com.ebuytech.svc.easybuy.service;

public interface IMemberService {

    /**
     * 添加会员
     * @param openId
     * @param memberName
     * @param sex
     * @param telephone
     * @return
     */
    boolean addMember(String openId, String memberName, String sex, String telephone);


}
