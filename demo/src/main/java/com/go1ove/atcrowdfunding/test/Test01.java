package com.go1ove.atcrowdfunding.test;

import com.go1ove.atcrowdfunding.bean.User;
import com.go1ove.atcrowdfunding.service.UserService;
import com.go1ove.atcrowdfunding.util.MD5Util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author go1ove
 * @create 2019-05-01-14:35
 */
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        UserService userService = ioc.getBean(UserService.class);

        for (int i=0;i<100;i++){
            User user = new User();
            user.setLoginacct("test"+i);
            user.setUserpswd(MD5Util.digest("123"));
            user.setUsername("test"+i);
            user.setEmail("test@777.com");
            user.setCreatetime("2019-05-01 12:12:12");
            userService.saveUser(user);
        }

    }
}
