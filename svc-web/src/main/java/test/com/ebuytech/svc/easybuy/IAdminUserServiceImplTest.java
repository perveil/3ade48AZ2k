//
//package test.com.ebuytech.svc.easybuy;
//
//import cn.binarywang.wx.miniapp.api.WxMaService;
//import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
//
//
//import com.ebuytech.svc.easybuy.util.JsonUtil;
//import com.ebuytech.svc.easybuy.vo.AdminToken;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.*;
//
//
///**
// * Created by Eric3 on 2018/9/14.
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = javafx.application.Application.class)
//public class IAdminUserServiceImplTest {
//
//    @Autowired WxMaService wxMaService;
//
//    @Test
//    public void login() throws Exception {
//
////        AdminToken token = iAdminUserService.login("admin","admin");
////        System.out.print(token.toString());
////        Assert.assertNotNull(token);
//        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo("5h0MxeSv5WROqVDUGyAaQw==", "eyniqtUHNLuNGhkRB4MToEWikltbgp1eC2LYJQh3zmqyjmDU4qEG8E301CqpJmDOlodaq+BFZ1fQQUBq+ZFrXkhEitLWkHVWtSikU+ZrPJKEOYQgZZRctVWncTCdis8NlPTC/PDcsZ9Q60gf47A6H1MC7uFYt2W0sjZdlt4nwmXrvzqSbsFOv+xQzWugCMZU49MIThi+oAIQ+o+xB9YufLez6nWeLDZi6KjSkJY8l+GK8X79RmiG/cBv4QXAj1Es60qI6cZMwW975H7PL75JG0Blz2Rq4rWMS7h2CrHr0DGxc87UA91bDvs2JilT6oAlzEB4Iwj+rNZRa9+20XuEFnRovQoL7cGDYr8o1vfBVF72f3ikiH4qvfzaZQcOa7VoC6W0EYjTJNME0aq+0EhA83uk4em9IJFzZsttApO5MLA9tS6TdDKA3D9fAsknURPZdvqjPB0Z/2rOfrb4DCm0dQ==", "mF6heF3hbV/MoJdfyC5Elw==");
//        System.out.println(JsonUtil.toJson(phoneNoInfo));
//    }
//
//}
