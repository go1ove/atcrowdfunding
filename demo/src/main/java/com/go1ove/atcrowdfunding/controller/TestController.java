package com.go1ove.atcrowdfunding.controller;

import com.go1ove.atcrowdfunding.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author go1ove
 * @create 2019-04-29-16:40
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test() {
        System.out.println("TestController");

        testService.insert();
        return "succes";
    }
}
