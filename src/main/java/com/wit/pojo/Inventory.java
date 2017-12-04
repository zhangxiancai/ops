package com.wit.pojo;

public class Inventory {
    private Integer goodsid;

    private Integer goodsamount;

    private Goods goods;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsamount() {
        return goodsamount;
    }

    public void setGoodsamount(Integer goodsamount) {
        this.goodsamount = goodsamount;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}