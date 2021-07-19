package com.example.demo.entity;

import java.io.Serializable;
//sgq
public class Information implements Serializable {

    private int informationId;
    private  String informationTitle;
    private  String informationSample;
    private  String informationContent;
    private  String state;
    private  String opinion;

    public Information() {
    }

    public Information(String informationTitle, String informationSample, String informationContent) {
        this.informationTitle = informationTitle;
        this.informationSample = informationSample;
        this.informationContent = informationContent;
    }

    public Information(int informationId, String informationTitle, String informationSample, String informationContent, String state, String opinion) {
        this.informationId = informationId;
        this.informationTitle = informationTitle;
        this.informationSample = informationSample;
        this.informationContent = informationContent;
        this.state = state;
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "Information{" +
                "informationId=" + informationId +
                ", informationTitle='" + informationTitle + '\'' +
                ", informationSample='" + informationSample + '\'' +
                ", informationContent='" + informationContent + '\'' +
                ", state='" + state + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public int getInformationId() {
        return informationId;
    }

    public void setInformationId(int informationId) {
        this.informationId = informationId;
    }

    public String getInformationTitle() {
        return informationTitle;
    }

    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle;
    }

    public String getInformationSample() {
        return informationSample;
    }

    public void setInformationSample(String informationSample) {
        this.informationSample = informationSample;
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
