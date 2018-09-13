package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.service.IAdminUserService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Eric3 on 2018/9/13.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private IAdminUserService iAdminUserService;

    /**
     * 超管登陆
     */
    @PostMapping("/login")
    public Res login(String userName,String userPwd){
        try {
            return ResUtil.success(iAdminUserService.login(userName,userPwd));
        }catch (Exception e){
            return ResUtil.error(-1,"error");
        }
    }

    /*public boolean checkToken(String userId, String token){

    }
*/
}
