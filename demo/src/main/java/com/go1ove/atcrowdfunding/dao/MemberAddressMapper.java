package com.go1ove.atcrowdfunding.dao;

import com.go1ove.atcrowdfunding.bean.MemberAddress;
import com.go1ove.atcrowdfunding.bean.MemberAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberAddressMapper {
    long countByExample(MemberAddressExample example);

    int deleteByExample(MemberAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberAddress record);

    int insertSelective(MemberAddress record);

    List<MemberAddress> selectByExample(MemberAddressExample example);

    MemberAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberAddress record, @Param("example") MemberAddressExample example);

    int updateByExample(@Param("record") MemberAddress record, @Param("example") MemberAddressExample example);

    int updateByPrimaryKeySelective(MemberAddress record);

    int updateByPrimaryKey(MemberAddress record);
}