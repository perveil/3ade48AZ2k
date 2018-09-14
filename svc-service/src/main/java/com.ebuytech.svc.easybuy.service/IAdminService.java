package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.vo.AdminToken;

public interface IAdminService {

    AdminToken login(String userName, String userPwd);

    boolean checkToken(String userId, String token);

    /**
     *
     * @param userId
     * @param oldPwd
     * @param newPwd
     * @return
     */
    boolean modifyPwd(String userId, String oldPwd, String newPwd);
}
