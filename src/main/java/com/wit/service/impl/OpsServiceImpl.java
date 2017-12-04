package com.wit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wit.dao.CountMapper;
import com.wit.dao.InventoryMapper;
import com.wit.dao.LogMapper;
import com.wit.dao.OrderMapper;
import com.wit.pojo.Count;
import com.wit.pojo.Inventory;
import com.wit.pojo.Log;
import com.wit.pojo.Order;
import com.wit.service.OpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OpsServiceImpl implements OpsService {


    @Autowired
    OrderMapper orderMapper;//订单
    @Autowired
   InventoryMapper inventoryMapper;//库存
    @Autowired
    CountMapper countMapper;//账户
    @Autowired
    LogMapper logMapper;//日志
    @Override
    @Transactional
    /*订单出库*/
    public String orderOut(String id) {
       Order order=orderMapper.selectByPrimaryKey(id);
       int orderamount=order.getAmount();//订单所需商品数
       int goodsAmount=inventoryMapper.selectByPrimaryKey(order.getGoodsid()).getGoodsamount();//库存数
        if(orderamount<=goodsAmount){
         order.setStatus(1);//更改订单状态为出库成功
            Inventory inventory=new Inventory();
            inventory.setGoodsamount(goodsAmount-orderamount);
            inventory.setGoodsid(order.getGoodsid());
            Date date=new Date();
            Log log=new Log(order,date);//新建日志对象
            orderMapper.updateByPrimaryKeySelective(order);//更改订单状态
            inventoryMapper.updateByPrimaryKeySelective(inventory);//更改库存数量
            logMapper.insertSelective(log);//新增日志信息
            return "出库成功";
        }
        else{
        Count count=countMapper.selectByPrimaryKey(order.getUserid());
           count.setBalance(count.getBalance()+order.getMoney());


            Date date=new Date();
            Log log=new Log(order,date);//新建日志对象
            countMapper.updateByPrimaryKeySelective(count);//返回账户余额
            orderMapper.deleteByPrimaryKey(order.getSerialno());//删除订单信息
            logMapper.insertSelective(log);//新增日志信息
            return "余额不足，出库失败！";

        }
    }
    /*输出所有日志*/
    public PageInfo<Log> findAllLog(Integer page, Integer pageSize){
        PageHelper.startPage(page, pageSize);
        List<Log> logs = logMapper.selectAllLogs();
        return  new PageInfo<>(logs);
    }
}
