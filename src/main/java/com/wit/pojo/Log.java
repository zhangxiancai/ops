package com.wit.pojo;

import java.util.Date;

public class Log {
    private String serialno;

    private Integer goodsid;

    private Integer amount;

    private Long money;

    private Integer userid;

    private Date committime;

    private Date finshtime;

    private Integer status;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCommittime() {
        return committime;
    }

    public void setCommittime(Date committime) {
        this.committime = committime;
    }

    public Date getFinshtime() {
        return finshtime;
    }

    public void setFinshtime(Date finshtime) {
        this.finshtime = finshtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
   public Log(){};

    public Log(Order order,Date date){
        this.finshtime=date;
        this.serialno=order.getSerialno();
        this.goodsid=order.getGoodsid();
        this.amount=order.getAmount();
        this.money=order.getMoney();
        this.userid=order.getUserid();
        this.committime=order.getCommittime();
        this.status=order.getStatus();


    }
}