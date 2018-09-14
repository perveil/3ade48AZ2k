package com.ebuytech.svc.easybuy.service;

public interface IMemberService {

    /**
     * 添加会员
     *
     * @param openId
     * @param memberName
     * @param sex
     * @param sessionCode
     * @param encryptedData
     * @param iv
     * @return
     */
    boolean addMember(String openId, String memberName, String sex,String sessionCode, String encryptedData, String iv);

    /**
     * 解密数据获取手机号
     *
     * @param sessionCode
     * @param encryptedData
     * @param iv
     * @return 手机号
     */
    String getPhoneByEncrypt(String sessionCode, String encryptedData, String iv);

}
