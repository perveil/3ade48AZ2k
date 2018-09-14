package test.com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.dao.AdminUserDAO;
import com.ebuytech.svc.easybuy.entity.AdminUser;
import com.ebuytech.svc.easybuy.entity.AdminUserExample;
import com.ebuytech.svc.easybuy.web.AppConfig;
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
@SpringBootTest(classes = AppConfig.class)
public class AdminUserDAOTest {

    @Autowired
    private AdminUserDAO adminUserDAO;

    @Test
    public void findByUserNameAndUserPwd() throws Exception{
//        AdminUser adminUser = adminUserDAO.findByUserNameAndUserPwd("admin","admin");
        AdminUserExample adminUserExample = new AdminUserExample();
        adminUserExample.createCriteria().andUserIdEqualTo("0");
        AdminUser adminUser = adminUserDAO.selectByExample(adminUserExample).get(0);
   //     AdminUser adminUser = adminUserDAO.selectByPrimaryKey("0");
        System.out.println(adminUser);
        Assert.assertNotNull(adminUser);
    }
}