package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Agreement;

import java.util.List;

public interface AgreementService {
    public int addAgreement(Agreement agreement) throws Exception;

    public int modifyAgreementByAgreementId(Agreement agreement) throws Exception;

    public List<Agreement> getAllAgreement(Integer pageNum) throws Exception;

    public List<Agreement> getAllAggreementToUser(String company,Integer pageNum) throws Exception;

    public Agreement getAgreement(Agreement agreement) throws Exception;

    public int modifyAgreementStateByAgreementId(Agreement agreement) throws Exception;
}
