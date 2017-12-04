package com.wit.dao;

import com.wit.pojo.Count;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CountMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Count record);

    int insertSelective(Count record);

    Count selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Count record);

    int updateByPrimaryKey(Count record);

    Count selectByUsername(String username);

    Count selectUser(@Param("username") String username, @Param("password") String password);

}