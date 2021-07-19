package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Company implements Serializable {

    private int companyid;
    private String companyName;
    private String companySampleName;
    private String legalPerson;
    private String registPart;
    private String registMoney;
    private String companyContacts;
    private String companyPhone;
    private String companyFax;
    private String companyEmail;
    private String companyLicense;
    private String companyTax;
    private String companyNum;
    private String companyBank;
    private String companyBankNum;
    private String companyPermit;
    private String companyPerson;
    private String companySituation;
    private String companyTransport;
    private String companyIntroduce;

    @Override
    public String toString() {
        return "Company{" +
                "companyid=" + companyid +
                ", companyName='" + companyName + '\'' +
                ", companySampleName='" + companySampleName + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", registPart='" + registPart + '\'' +
                ", registMoney='" + registMoney + '\'' +
                ", companyContacts='" + companyContacts + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", companyFax='" + companyFax + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", companyLicense='" + companyLicense + '\'' +
                ", companyTax='" + companyTax + '\'' +
                ", companyNum='" + companyNum + '\'' +
                ", companyBank='" + companyBank + '\'' +
                ", companyBankNum='" + companyBankNum + '\'' +
                ", companyPermit='" + companyPermit + '\'' +
                ", companyPerson='" + companyPerson + '\'' +
                ", companySituation='" + companySituation + '\'' +
                ", companyTransport='" + companyTransport + '\'' +
                ", companyIntroduce='" + companyIntroduce + '\'' +
                '}';
    }

    public Company(int companyid, String companyName, String companySampleName, String legalPerson, String registPart, String registMoney, String companyContacts, String companyPhone, String companyFax, String companyEmail, String companyLicense, String companyTax, String companyNum, String companyBank, String companyBankNum, String companyPermit, String companyPerson, String companySituation, String companyTransport, String companyIntroduce) {
        this.companyid = companyid;
        this.companyName = companyName;
        this.companySampleName = companySampleName;
        this.legalPerson = legalPerson;
        this.registPart = registPart;
        this.registMoney = registMoney;
        this.companyContacts = companyContacts;
        this.companyPhone = companyPhone;
        this.companyFax = companyFax;
        this.companyEmail = companyEmail;
        this.companyLicense = companyLicense;
        this.companyTax = companyTax;
        this.companyNum = companyNum;
        this.companyBank = companyBank;
        this.companyBankNum = companyBankNum;
        this.companyPermit = companyPermit;
        this.companyPerson = companyPerson;
        this.companySituation = companySituation;
        this.companyTransport = companyTransport;
        this.companyIntroduce = companyIntroduce;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySampleName() {
        return companySampleName;
    }

    public void setCompanySampleName(String companySampleName) {
        this.companySampleName = companySampleName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getRegistPart() {
        return registPart;
    }

    public void setRegistPart(String registPart) {
        this.registPart = registPart;
    }

    public String getRegistMoney() {
        return registMoney;
    }

    public void setRegistMoney(String registMoney) {
        this.registMoney = registMoney;
    }

    public String getCompanyContacts() {
        return companyContacts;
    }

    public void setCompanyContacts(String companyContacts) {
        this.companyContacts = companyContacts;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyLicense() {
        return companyLicense;
    }

    public void setCompanyLicense(String companyLicense) {
        this.companyLicense = companyLicense;
    }

    public String getCompanyTax() {
        return companyTax;
    }

    public void setCompanyTax(String companyTax) {
        this.companyTax = companyTax;
    }

    public String getCompanyNum() {
        return companyNum;
    }

    public void setCompanyNum(String companyNum) {
        this.companyNum = companyNum;
    }

    public String getCompanyBank() {
        return companyBank;
    }

    public void setCompanyBank(String companyBank) {
        this.companyBank = companyBank;
    }

    public String getCompanyBankNum() {
        return companyBankNum;
    }

    public void setCompanyBankNum(String companyBankNum) {
        this.companyBankNum = companyBankNum;
    }

    public String getCompanyPermit() {
        return companyPermit;
    }

    public void setCompanyPermit(String companyPermit) {
        this.companyPermit = companyPermit;
    }

    public String getCompanyPerson() {
        return companyPerson;
    }

    public void setCompanyPerson(String companyPerson) {
        this.companyPerson = companyPerson;
    }

    public String getCompanySituation() {
        return companySituation;
    }

    public void setCompanySituation(String companySituation) {
        this.companySituation = companySituation;
    }

    public String getCompanyTransport() {
        return companyTransport;
    }

    public void setCompanyTransport(String companyTransport) {
        this.companyTransport = companyTransport;
    }

    public String getCompanyIntroduce() {
        return companyIntroduce;
    }

    public void setCompanyIntroduce(String companyIntroduce) {
        this.companyIntroduce = companyIntroduce;
    }

    public Company() {
        super();
    }
}
