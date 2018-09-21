package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric3 on 2018/9/14.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/queryAccountListByPage")
    @ResponseBody
    Res queryAccountListByPage(int page){
        return ResUtil.success(accountService.queryAccountListByPage(page));
    }

    @RequestMapping("/queryAccountInfo")
    @ResponseBody Res queryAccountInfo(String openId){
        return ResUtil.success(accountService.queryAccountInfo(openId));
    }

    @RequestMapping("/freezeAccount") @ResponseBody Res freezeAccount(String accountId) {
        return ResUtil.success(accountService.freezeAccount(accountId));
    }

    @RequestMapping("/addBalance")
    @ResponseBody Res addBalance(String accountId, int balance){
        return ResUtil.success(accountService.addBalance(accountId, balance));
    }

    @RequestMapping("/queryAccountByKeyword")
    @ResponseBody Res queryAccountByKeyword(int page,String phone, String valueCardId, String memberId) {
        return ResUtil.success(accountService.queryAccountByKeyword(page, phone, valueCardId, memberId));
    }
}
