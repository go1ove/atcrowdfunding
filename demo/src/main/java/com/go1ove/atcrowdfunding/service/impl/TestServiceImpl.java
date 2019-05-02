package com.go1ove.atcrowdfunding.service.impl;

import com.go1ove.atcrowdfunding.dao.TestDao;
import com.go1ove.atcrowdfunding.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author go1ove
 * @create 2019-04-29-16:45
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void insert() {
        Map map = new HashMap();
        map.put("name","zhang3");



        testDao.insert(map);
    }
}
