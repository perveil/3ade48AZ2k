package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.vo.AdminToken;

import java.util.List;

public interface IAdminService {

    /**
     * zty
     *
     * @param userName
     * @param userPwd
     * @return
     */
    AdminToken login(String userName, String userPwd);

    /**
     * zty
     *
     * @param userId
     * @param token
     * @return
     */
    boolean checkToken(String userId, String token);

    /**
     * zty
     *
     * @param userId
     * @param oldPwd
     * @param newPwd
     * @return
     */
    boolean modifyPwd(String userId, String oldPwd, String newPwd);

    String addUser(String userName, String userPwd, int roleId);

}
