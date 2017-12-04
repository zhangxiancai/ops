package com.wit.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Order {
    private String serialno;

    private Integer goodsid;

    private Integer amount;

    private Long money;

    private Integer userid;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date committime;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}