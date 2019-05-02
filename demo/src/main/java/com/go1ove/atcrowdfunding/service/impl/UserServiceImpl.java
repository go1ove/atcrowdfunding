package com.go1ove.atcrowdfunding.service.impl;

import com.go1ove.atcrowdfunding.bean.User;
import com.go1ove.atcrowdfunding.dao.UserMapper;
import com.go1ove.atcrowdfunding.exception.LoginFailException;
import com.go1ove.atcrowdfunding.service.UserService;
import com.go1ove.atcrowdfunding.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author go1ove
 * @create 2019-04-30-12:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserlogin(Map<String, Object> paramMap) {
        User user = userMapper.queryUserlogin(paramMap);

        if (user == null) {
            throw new LoginFailException("账号或密码不正确！");
        }
        return user;
    }

    /*@Override
    public Page queryPage(Integer pageno, Integer pagesize) {
        Page page = new Page(pageno,pagesize);

        Integer startIndex = page.getStartIndex();

        List<User> data = userMapper.queryList(startIndex,pagesize);

        page.setData(data);

        Integer totalsize = userMapper.queryCount();
        page.setTotalsize(totalsize);
        return page;
    }*/

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Page queryPage(Map<String, Object> paramMap) {

        Page page = new Page((Integer) paramMap.get("pageno"), (Integer) paramMap.get("pagesize"));

        Integer startIndex = page.getStartIndex();

        paramMap.put("startIndex", startIndex);

        List<User> data = userMapper.queryList(paramMap);

        page.setData(data);

        Integer totalsize = userMapper.queryCount(paramMap);
        page.setTotalsize(totalsize);
        return page;
    }
}
