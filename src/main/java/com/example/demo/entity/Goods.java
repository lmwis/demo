package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {
    private int goodsid;
    private String companyName;
    private String state;
    private String role;
    private double supply;
    private String proArea;
    private double goodsPrice;
    private String drliverGoods;
    private double tranPrice;
    private String quality;
    private String opinion;

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", companyName='" + companyName + '\'' +
                ", state='" + state + '\'' +
                ", role='" + role + '\'' +
                ", supply=" + supply +
                ", proArea='" + proArea + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", drliverGoods='" + drliverGoods + '\'' +
                ", tranPrice=" + tranPrice +
                ", quality='" + quality + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public Goods(int goodsid, String companyName, String state, String role, double supply, String proArea, double goodsPrice, String drliverGoods, double tranPrice, String quality, String opinion) {
        this.goodsid = goodsid;
        this.companyName = companyName;
        this.state = state;
        this.role = role;
        this.supply = supply;
        this.proArea = proArea;
        this.goodsPrice = goodsPrice;
        this.drliverGoods = drliverGoods;
        this.tranPrice = tranPrice;
        this.quality = quality;
        this.opinion = opinion;
    }

    public Goods(int goodsid, String companyName, String state, String role, double supply, String proArea, double goodsPrice, String drliverGoods, double tranPrice, String quality) {
        this.goodsid = goodsid;
        this.companyName = companyName;
        this.state = state;
        this.role = role;
        this.supply = supply;
        this.proArea = proArea;
        this.goodsPrice = goodsPrice;
        this.drliverGoods = drliverGoods;
        this.tranPrice = tranPrice;
        this.quality = quality;
    }

    public Goods() {
        super();
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSupply() {
        return supply;
    }

    public void setSupply(double supply) {
        this.supply = supply;
    }

    public String getProArea() {
        return proArea;
    }

    public void setProArea(String proArea) {
        this.proArea = proArea;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getDrliverGoods() {
        return drliverGoods;
    }

    public void setDrliverGoods(String drliverGoods) {
        this.drliverGoods = drliverGoods;
    }

    public double getTranPrice() {
        return tranPrice;
    }

    public void setTranPrice(double tranPrice) {
        this.tranPrice = tranPrice;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
