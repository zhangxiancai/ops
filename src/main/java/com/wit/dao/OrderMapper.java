package com.wit.dao;


import com.wit.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(String serialno);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String serialno);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectAllOrder();

    int totalOrder();
}