package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Agreement;
import com.example.demo.entity.Users;
import com.example.demo.service.AgreementService;
import com.example.demo.service.impl.AdminServiceImpl;
import com.example.demo.service.impl.AgreementServiceImpl;
import com.example.demo.service.impl.UserServiceImpl;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 【需求】
 * 1.初始系统管理员，管理二级管理员
 * 2.系统管理员创建二级管理员并赋权
 * @Author lmwis
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    private Logger log = Logger.getLogger(AdminController.class);
    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    private AgreementServiceImpl agreementService;
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping(value = "/regist",method = RequestMethod.POST)//@author 毛鑫宇
    public Map regist(@RequestParam Map<String, String> params) throws Exception{
        Map<String,Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        String adminName = params.get("adminname");
        String password = params.get("password");
        String role = params.get("role");
        Admin admin = new Admin(adminName,password,role);
        int answer =  adminService.regist(admin);
        if (answer == 1) {
            meta.put("msg","注册成功");
            meta.put("status",200);
        }
        else {
            meta.put("msg","注册失败");
            meta.put("status",300);
        }
        map.put("data",data);
        map.put("meta",meta);
        return map;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)//@author 毛鑫宇
    public Map login(@RequestParam Map<String, String> params) throws Exception{
        Map<String,Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        String adminName = params.get("adminname");
        String password = params.get("password");
        System.out.println(adminName+"   "+password);
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        admin.setPassword(password);
        Admin newadmin =  adminService.login(admin);
        log.info("newadmin="+newadmin);
        if (newadmin != null) {
            newadmin.setPassword(null);
            data.put("admin", newadmin);
            meta.put("msg","登录成功");
            meta.put("status",200);
        }
        else {
            meta.put("msg","登录失败");
            meta.put("status",300);
        }
        map.put("data",data);
        map.put("meta",meta);
        return map;
    }
    @RequestMapping(value = "/modifypassword",method = RequestMethod.POST)//@author 毛鑫宇
    public Map modifyPassword(@RequestParam Map<String, String> params) throws Exception{
        Map<String,Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        System.out.println(params);
        String adminId = params.get("adminid");
        String password = params.get("password");
        Admin admin = new Admin();
        admin.setAdminId(Integer.parseInt(adminId));
        admin.setPassword(password);
        int answer =  adminService.modifyPasswordByAdminId(admin);
        log.info(answer+" "+admin);
        System.out.println("answer="+answer);
        if (answer == 1) {
            meta.put("msg","修改成功");
            meta.put("status",200);
        }
        else {
            meta.put("msg","修改失败");
            meta.put("status",300);
        }
        map.put("data",data);
        map.put("meta",meta);
        return map;
    }
    @RequestMapping(value = "/getalladmin",method = RequestMethod.POST)//@author 毛鑫宇
    public Map getAllAdmin(@RequestParam Map<String, String> params) throws Exception{
        Map<String,Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        System.out.println(params);
        String pageNum = params.get("pagenum");
        List<Admin> adminList=  adminService.getAllAdmin(Integer.parseInt(pageNum));
        PageInfo pageInfo = new PageInfo(adminList);
        int total= (int) pageInfo.getTotal();
        for (int i = 0; i < adminList.size(); i++) {
            adminList.get(i).setPassword(null);
        }
        data.put("adminList",adminList);
        data.put("total",total);
        meta.put("msg","查询成功");
        meta.put("status",200);
        map.put("data",data);
        map.put("meta",meta);
        return map;
    }
    @RequestMapping(value = "/getadmin",method = RequestMethod.POST)//@author 毛鑫宇
    public Map getAdmin(@RequestParam Map<String, String> params) throws Exception{
        Map<String,Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        System.out.println(params);
        String adminId = params.get("adminid");
        Admin admin = new Admin();
        admin.setAdminId(Integer.parseInt(adminId));
        Admin newadmin =  adminService.getAdmin(admin);
        if (newadmin != null) {
            newadmin.setPassword(null);
            data.put("admin",newadmin);
            meta.put("msg","查询成功");
            meta.put("status",200);
        }
        else {meta.put("msg","查询失败");
            meta.put("status",300);
        }
        map.put("data",data);
        map.put("meta",meta);
        return map;
    }
}
