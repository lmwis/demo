package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Agreement implements Serializable {
    private String agreementId;
    private String aCompany;
    private String bCompany;
    private String transport;
    private Double price;
    private String time;
    private String state;
    private String opinion;
}
