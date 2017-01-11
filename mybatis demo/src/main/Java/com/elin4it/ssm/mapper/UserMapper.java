package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample();

    User selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}