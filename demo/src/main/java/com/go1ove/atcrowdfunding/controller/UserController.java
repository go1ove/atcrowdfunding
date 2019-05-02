package com.go1ove.atcrowdfunding.controller;

import com.go1ove.atcrowdfunding.service.UserService;
import com.go1ove.atcrowdfunding.util.AjaxResult;
import com.go1ove.atcrowdfunding.util.Page;
import com.go1ove.atcrowdfunding.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author go1ove
 * @create 2019-05-01-12:12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("toIndex")
    public String toIndex() {

        return "user/index";
    }

    //异步请求 条件查询
    @ResponseBody
    @RequestMapping("/index")
    public Object index(@RequestParam(value = "pageno", required = false, defaultValue = "1") Integer pageno,
                        @RequestParam(value = "pagesize", required = false, defaultValue = "10") Integer pagesize,
                        String queryText) {
        AjaxResult result = new AjaxResult();

        try {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("pageno", pageno);
            paramMap.put("pagesize", pagesize);

            if (StringUtil.isNotEmpty(queryText)) {
                paramMap.put("queryText", queryText);
            }
            Page page = userService.queryPage(paramMap);

            result.setSuccess(true);
            result.setPage(page);
        } catch (Exception e) {
            result.setSuccess(false);
            e.printStackTrace();
            result.setMessage("查询数据失败！");
        }
        return result;
    }

    //同步请求
    /*@RequestMapping("/index")
    public String index(@RequestParam(value = "pageno", required = false, defaultValue = "1") Integer pageno,
                        @RequestParam(value = "pagesize", required = false, defaultValue = "10") Integer pagesize, Map map) {
        Page page = userService.queryPage(pageno, pagesize);
        map.put("page", page);
        return "user/index";
    }*/
}
