package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private int orderId;
    private String agreementId;
    private int goodsId;
    private String state;
    private String ACompany;
    private String BCompany;

    public Order(int orderId, String agreementId, int goodsId, String state, String ACompany, String BCompany) {
        this.orderId = orderId;
        this.agreementId = agreementId;
        this.goodsId = goodsId;
        this.state = state;
        this.ACompany = ACompany;
        this.BCompany = BCompany;
    }
    public Order(int orderId, String agreementId, int goodsId, String state) {
        this.orderId = orderId;
        this.agreementId = agreementId;
        this.goodsId = goodsId;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", agreementId='" + agreementId + '\'' +
                ", goodsId=" + goodsId +
                ", state='" + state + '\'' +
                ", ACompany='" + ACompany + '\'' +
                ", BCompany='" + BCompany + '\'' +
                '}';
    }

    public Order() {
        super();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getACompany() {
        return ACompany;
    }

    public void setACompany(String ACompany) {
        this.ACompany = ACompany;
    }

    public String getBCompany() {
        return BCompany;
    }

    public void setBCompany(String BCompany) {
        this.BCompany = BCompany;
    }
}
