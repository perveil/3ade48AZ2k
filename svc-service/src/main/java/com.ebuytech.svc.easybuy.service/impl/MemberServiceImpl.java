package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.MemberDAO;
import com.ebuytech.svc.easybuy.entity.Member;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IMemberService;
import com.ebuytech.svc.easybuy.util.RedisUtil;
import com.ebuytech.svc.easybuy.util.UUIDUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class MemberServiceImpl {

    @Resource
    private MemberDAO memberDAO;

    //redis使用示例
    @Resource
    private RedisUtil redisUtil;

    public boolean addMember(String openId, String memberName, String sex, String telephone) {
        throw new ClientException(ResultEnums.TEST_FAIL);
//        Member member = new Member();
//        //自动生成的mybatis mapper 插入操作里没有带主键，需手动修改
//        member.setMemberId(UUIDUtils.getUUID());
//        System.out.println(member.getMemberId());
//        member.setMemberName(memberName);
//        member.setSex(sex);
//        member.setTelephone(telephone);
//        redisUtil.set("1","23");
//        System.out.println(redisUtil.get("1"));
//        return memberDAO.insertSelective(member) > 0;
    }
}
