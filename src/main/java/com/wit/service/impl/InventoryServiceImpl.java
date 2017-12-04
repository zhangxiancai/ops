package com.wit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wit.dao.InventoryMapper;
import com.wit.pojo.Inventory;
import com.wit.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryMapper inventoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer goodsid) {
        int row = 0;
        row = inventoryMapper.deleteByPrimaryKey(goodsid);
        return row;
    }

    @Override
    public int insert(Inventory record) {
        int row = 0;
        row = inventoryMapper.insert(record);
        return row;
    }

    @Override
    public int insertSelective(Inventory record) {
        int row = 0;
        row = inventoryMapper.insertSelective(record);
        return row;
    }

    @Override
    public Inventory selectByPrimaryKey(Integer goodsid) {
        Inventory inventory = null;
        inventory = inventoryMapper.selectByPrimaryKey(goodsid);
        return inventory;
    }

    @Override
    public int updateByPrimaryKeySelective(Inventory record) {
        int row = 0;
        row = inventoryMapper.updateByPrimaryKeySelective(record);
        return row;
    }

    @Override
    public int updateByPrimaryKey(Inventory record) {
        int row = 0;
        row = inventoryMapper.updateByPrimaryKey(record);
        return row;
    }

    @Override
    public PageInfo<Inventory> selectAllInventories(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Inventory> inventories = null;
        inventories = inventoryMapper.selectAllInventories();
        return new PageInfo<>(inventories);
    }
}
