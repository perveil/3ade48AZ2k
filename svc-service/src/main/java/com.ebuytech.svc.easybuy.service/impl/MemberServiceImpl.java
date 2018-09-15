package com.ebuytech.svc.easybuy.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import com.ebuytech.svc.easybuy.dao.MemberDAO;
import com.ebuytech.svc.easybuy.entity.Member;
import com.ebuytech.svc.easybuy.service.IMemberService;
import com.ebuytech.svc.easybuy.util.JsonUtil;
import com.ebuytech.svc.easybuy.util.MD5Utils;
import com.ebuytech.svc.easybuy.util.RedisUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service @Transactional public class MemberServiceImpl implements IMemberService {

    @Resource private MemberDAO memberDAO;

    @Resource private RedisUtil redisUtil;

    @Resource private WxMaService wxMaService;

    public boolean addMember(String openId, String memberName, String sex, String sessionCode, String encryptedData, String iv) {
        Member member = new Member();
        String res = (String) redisUtil.get(sessionCode);
        String[] strArray = res.split(",");
        System.out.println(strArray[1]);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(strArray[1], encryptedData, iv);
        String telephone = JsonUtil.toJson(phoneNoInfo);
        member.setMemberId(MD5Utils.getMD5(openId));
        member.setMemberName(memberName);
        member.setSex(sex);
        member.setTelephone(telephone);
        int flag = memberDAO.insert(member);
        if (flag > 0) {
            return true;
        }
        return false;
    }


    @Override public String getPhoneByEncrypt(String sessionCode, String encryptedData, String iv) {
        String res = (String) redisUtil.get(sessionCode);
        String[] strArray = res.split(",");
        System.out.println(strArray[1]);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(strArray[1], encryptedData, iv);
        return JsonUtil.toJson(phoneNoInfo);
    }
}
