package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.dao.MemberDAO;
import com.ebuytech.svc.easybuy.dao.ValueCardDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.Member;
import com.ebuytech.svc.easybuy.entity.MemberExample;
import com.ebuytech.svc.easybuy.entity.ValueCard;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.ICardService;
import com.ebuytech.svc.easybuy.util.MD5Utils;
import com.ebuytech.svc.easybuy.util.UUIDUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service @Transactional public class CardServiceImpl implements ICardService {
    @Resource ValueCardDAO valueCardDAO;

    @Resource AccountDAO accountDAO;

    @Resource MemberDAO memberDAO;

    @Override public boolean addValueCard(String openId) {
        //TODO 把卡券添加到微信卡券包里
        String accountId = UUIDUtils.getUUID();
        String valueCardId = MD5Utils.getMD5(MD5Utils.getMD5(openId));
        String memberId = MD5Utils.getMD5(openId);

        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMemberIdEqualTo(memberId);
        List<Member> memberList = memberDAO.selectByExample(memberExample);
        if (memberList == null || memberList.size() <= 0) {
            throw new ClientException(ResultEnums.TEST_FAIL);
        } else {
            System.out.println("1111111");
            Member member = memberList.get(0);
            String telephone = member.getTelephone();
            ValueCard valueCard = new ValueCard();
            valueCard.setAccountId(accountId);
            valueCard.setMemberId(memberId);
            valueCard.setValueCardId(valueCardId);

            Account account = new Account();
            account.setAccountId(accountId);
            account.setOpenId(openId);
            account.setAccountNo(telephone);
            account.setMemberId(memberId);
            account.setValueCardId(valueCardId);

            return valueCardDAO.insertSelective(valueCard) > 0 && accountDAO.insertSelective(account) > 0;
        }

    }
}
