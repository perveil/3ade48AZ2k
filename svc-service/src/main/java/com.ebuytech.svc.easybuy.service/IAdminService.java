package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.vo.AdminToken;

import java.util.List;
import java.util.Map;

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

    /**
     * zty
     * 首页展示
     * 1、今日充值次数
     * 2、昨日充值次数
     * 3、今日消费次数
     * 4、昨日消费次数
     * 5、发卡总人数
     * 6、昨日新增发卡数
     * 7、充值金额
     * 8、昨日充值金额
     * 9、消费金额
     * 10、昨日消费金额
     * 11、资金沉淀
     * @return
     */
    String queryDaliyCounts();


}
