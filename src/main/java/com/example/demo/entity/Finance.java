package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Finance implements Serializable {
    private String companyName;
    private double surplusMoney;
    private double frozenMoney;

    public Finance(String companyName, double surplusMoney, double frozenMoney) {
        this.companyName = companyName;
        this.surplusMoney = surplusMoney;
        this.frozenMoney = frozenMoney;
    }

    @Override
    public String toString() {
        return "Finance{" +
                "companyName='" + companyName + '\'' +
                ", surplusMoney='" + surplusMoney + '\'' +
                ", frozenMoney='" + frozenMoney + '\'' +
                '}';
    }

    public Finance() {
        super();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSurplusMoney() {
        return surplusMoney;
    }

    public void setSurplusMoney(double surplusMoney) {
        this.surplusMoney = surplusMoney;
    }

    public double getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(double frozenMoney) {
        this.frozenMoney = frozenMoney;
    }
}
