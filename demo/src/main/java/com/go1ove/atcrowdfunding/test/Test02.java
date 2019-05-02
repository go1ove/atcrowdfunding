package com.go1ove.atcrowdfunding.test;

import com.go1ove.atcrowdfunding.dao.UserMapper;
import com.go1ove.atcrowdfunding.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author go1ove
 * @create 2019-05-01-21:43
 */
public class Test02 {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        UserMapper userMapper = ioc.getBean(UserMapper.class);

        Map<String ,Object> map = new HashMap<>();
        map.put("queryTest",22);
        map.put("startIndex",0);
        map.put("pagesize",50);


        System.out.println(userMapper.queryList(map));
    }
}
