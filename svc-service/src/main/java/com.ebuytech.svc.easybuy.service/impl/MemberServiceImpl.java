package com.ebuytech.svc.easybuy.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import com.ebuytech.svc.easybuy.dao.MemberDAO;
import com.ebuytech.svc.easybuy.entity.Member;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IMemberService;
import com.ebuytech.svc.easybuy.util.JsonUtil;
import com.ebuytech.svc.easybuy.util.MD5Utils;
import com.ebuytech.svc.easybuy.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service @Transactional @Slf4j public class MemberServiceImpl implements IMemberService {

    @Resource private MemberDAO memberDAO;

    @Resource private RedisUtil redisUtil;

    @Resource private WxMaService wxMaService;

    @Override public boolean addMember(String openId, String memberName, String sex, String sessionCode, String encryptedData, String iv) {
        Member member = new Member();
        String res = (String) redisUtil.get(sessionCode);

        String[] strArray = res.split(",");
        log.info(strArray[1]);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(strArray[1], encryptedData, iv);
        log.info(phoneNoInfo.toString());
        String telephone = phoneNoInfo.getPurePhoneNumber();

        member.setMemberId(MD5Utils.getMD5(openId));
        member.setMemberName(memberName);
        if (sex.equals("1")) {
            member.setSex("男");
        } else {
            member.setSex("女");
        }
        member.setTelephone(telephone);
        if (memberDAO.insert(member) > 0) {
            return true;
        }
        throw new ClientException(ResultEnums.REGISER_MEMBER_ERROR);
    }

    @Override public String getPhoneByEncrypt(String sessionCode, String encryptedData, String iv) {
        String res = (String) redisUtil.get(sessionCode);
        String[] strArray = res.split(",");
        System.out.println(strArray[1]);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(strArray[1], encryptedData, iv);
        return JsonUtil.toJson(phoneNoInfo);
    }
}
