package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdminUser;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Eric3 on 2018/9/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AdminUserDAOTest {

    @Autowired
    private AdminUserDAO adminUserDAO;

    @Test
    public void findByUserNameAndUserPwd() throws Exception{
//        AdminUser adminUser = adminUserDAO.findByUserNameAndUserPwd("admin","admin");
        AdminUser adminUser = adminUserDAO.selectByPrimaryKey("0");

        System.out.println(adminUser);
        Assert.assertNotNull(adminUser);
    }
}