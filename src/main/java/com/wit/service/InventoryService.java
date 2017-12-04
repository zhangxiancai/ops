package com.wit.service;

import com.github.pagehelper.PageInfo;
import com.wit.pojo.Inventory;

import java.util.List;

public interface InventoryService {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

   PageInfo<Inventory> selectAllInventories(Integer page, Integer pageSize);
}
