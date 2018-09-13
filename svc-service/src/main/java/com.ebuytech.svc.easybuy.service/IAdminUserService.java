package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.vo.AdminToken;

public interface IAdminUserService {

    AdminToken login(String userName, String userPwd);

    boolean checkToken(String userId, String token);
}
