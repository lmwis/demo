package com.example.demo.service.impl;

import com.example.demo.dao.AgreementDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Agreement;
import com.example.demo.service.AgreementService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AgreementServiceImpl implements AgreementService {
    @Autowired
    private AgreementDao agreementDao; // 依赖注入
    @Override
    public int addAgreement(Agreement agreement) throws Exception {
        System.out.println(agreement);
        return agreementDao.addAggreement(agreement);
    }

    @Override
    public int modifyAgreementByAgreementId(Agreement agreement) throws Exception {
        return agreementDao.modifyAgreementByAgreementId(agreement);
    }
    @Override
    public int modifyAgreementStateByAgreementId(Agreement agreement) throws Exception {
        System.out.println(agreement);
        return agreementDao.modifyAgreementStateByAgreementId(agreement);
    }

    @Override
    public List<Agreement> getAllAgreement(Integer pageNum) throws Exception {
        if (pageNum == null) {
            pageNum = 1;
        } else if (pageNum <= 0) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum, 2);
        return agreementDao.getAllAggreement();
    }

    @Override
    public List<Agreement> getAllAggreementToUser(String company,Integer pageNum) throws Exception {
        if (pageNum == null) {
            pageNum = 1;
        } else if (pageNum <= 0) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum, 2);
        return agreementDao.getAllAggreementToUser(company);
    }

    @Override
    public Agreement getAgreement(Agreement agreement) throws Exception {
        return agreementDao.getAggreement(agreement);
    }
}
