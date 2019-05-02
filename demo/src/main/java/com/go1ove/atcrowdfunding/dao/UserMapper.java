package com.go1ove.atcrowdfunding.dao;

import com.go1ove.atcrowdfunding.bean.User;
import com.go1ove.atcrowdfunding.bean.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {



    User queryUserlogin(Map<String, Object> paramMap);

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    //Integer queryCount();

    //List<User> queryList(@Param("startIndex") Integer startIndex,@Param("pagesize") Integer pagesize);

    List<User> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

}