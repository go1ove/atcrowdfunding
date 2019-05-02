package com.go1ove.atcrowdfunding.service;

import com.go1ove.atcrowdfunding.bean.User;
import com.go1ove.atcrowdfunding.util.Page;

import java.util.Map;

/**
 * @author go1ove
 * @create 2019-04-30-11:58
 */
public interface UserService {
    User queryUserlogin(Map<String, Object> paramMap);

    //Page queryPage(Integer pageno, Integer pagesize);


    int saveUser(User user);



    Page queryPage(Map<String,Object> paramMap);
}
