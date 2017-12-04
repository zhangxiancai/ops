package com.wit.dao;


import com.wit.pojo.Log;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LogMapper {
    int deleteByPrimaryKey(String serialno);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(String serialno);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

    List<Log> selectAllLogs();
}