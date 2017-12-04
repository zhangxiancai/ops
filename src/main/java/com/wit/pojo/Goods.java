package com.wit.pojo;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Long goodsprice;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Long getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Long goodsprice) {
        this.goodsprice = goodsprice;
    }
}