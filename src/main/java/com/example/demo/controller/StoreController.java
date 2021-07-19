package com.example.demo.controller;

import com.example.demo.entity.Agreement;
import com.example.demo.response.CommonReturnType;
import com.example.demo.service.impl.AgreementServiceImpl;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 【需求】
 * 1.添加商品
 * 2.获取一页商品
 * 3.获取我的商品
 * 4.修改商品
 * 5.查询商品
 * 6.修改商品状态
 * @Author lmwis
 */
@RestController
@RequestMapping("/store")
public class StoreController {
    private Logger logger = Logger.getLogger(StoreController.class);
    @Autowired
    private AgreementServiceImpl agreementService;

    @PostMapping(value = "/add")
    public CommonReturnType add(@RequestParam Map<String, String> params) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        System.out.println(params);
        String aggrementId = params.get("aggrementid");
        String aCompany = params.get("acompany");
        String bCompany = params.get("bcompany");
        String transport = params.get("transport");
        String price = params.get("price");
        String time = params.get("time");
        Agreement agreement = new Agreement(aggrementId, aCompany, bCompany, transport, Double.parseDouble(price), time,"","");
        int answer = agreementService.addAgreement(agreement);
        if (answer == 1) {
            meta.put("msg", "添加成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "添加失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return CommonReturnType.create(map);
    }

    @GetMapping(value = "/all")
    public CommonReturnType getAll(String pageNum) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        List<Agreement> agreementList = agreementService.getAllAgreement(Integer.parseInt(pageNum));//用户查询agreementService.getAllAggreementToUser("多少度");
        PageInfo pageInfo = new PageInfo(agreementList);
        int total = (int) pageInfo.getTotal();
        data.put("agreementList", agreementList);
        data.put("total", total);
        meta.put("msg", "查询成功");
        meta.put("status", 200);
        map.put("data", data);
        map.put("meta", meta);
        return CommonReturnType.create(map);
    }

    @RequestMapping(value = "/my", method = RequestMethod.POST)
    public CommonReturnType getMy(String company, String pageNum) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        List<Agreement> storeList = agreementService.getAllAggreementToUser(company, new Integer(pageNum));//用户查询agreementService.getAllAggreementToUser("多少度");
        PageInfo pageInfo = new PageInfo(storeList);
        int total = (int) pageInfo.getTotal();
        data.put("storeList", storeList);
        data.put("total", total);
        meta.put("msg", "查询成功");
        meta.put("status", 200);
        map.put("data", data);
        map.put("meta", meta);
        return CommonReturnType.create(map);
    }

    @PutMapping(value = "/{id}")
    public CommonReturnType updateStore(@PathVariable String id,
                                        String aCompany,
                                        String bCompany,
                                        String transport,
                                        String price,
                                        String time) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        Agreement agreement = new Agreement(id, aCompany, bCompany, transport, Double.parseDouble(price), time,"","");
        System.out.println(agreement);
        int answer = agreementService.modifyAgreementByAgreementId(agreement);
        if (answer == 1) {
            meta.put("msg", "修改成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "修改失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return CommonReturnType.create(map);
    }

    @PutMapping(value = "/state/{id}")
    public CommonReturnType updateStoreState(@PathVariable String id, String state, String opinion) throws Exception {
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        Map<String, Object> map = new HashMap<>();
        Agreement agreement = new Agreement(id, null, null, null, null, null, state, opinion);
        int answer = agreementService.modifyAgreementStateByAgreementId(agreement);
        if (answer == 1) {
            meta.put("msg", "修改成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "修改失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return CommonReturnType.create(map);
    }

    @GetMapping(value = "/{id}")
    public CommonReturnType getById(@PathVariable String id) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        Agreement agreement = new Agreement();
        agreement.setAgreementId(id);
        Agreement newagreement = agreementService.getAgreement(agreement);
        if (newagreement != null) {
            data.put("agreement", newagreement);
            meta.put("msg", "查询成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "查询失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return CommonReturnType.create(map);
    }
}