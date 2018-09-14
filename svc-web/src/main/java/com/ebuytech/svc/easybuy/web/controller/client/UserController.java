package com.ebuytech.svc.easybuy.web.controller.client;


import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("client")
public class UserController {

    @Resource
    private IAccountService accountService;

    @PostMapping("user/login")
    public Res login(String code) {
        return ResUtil.success(accountService.login(code));
    }

    @PostMapping("user/addUser")
    public Res addUser(){
        return null;
    }
}
