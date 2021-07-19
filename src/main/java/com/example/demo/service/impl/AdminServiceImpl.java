package com.example.demo.service.impl;
import com.example.demo.controller.AdminController;
import com.example.demo.dao.AdminDao;
import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    private Logger log = Logger.getLogger(AdminController.class);
    @Autowired
    private AdminDao adminDao;//依赖注入
    @Override
    public int regist(Admin admin) throws Exception {
      /*  String newPass = new MD5().getMD5ofStr(admin.getPassword());
        admin.setPassword(newPass);*/
        return adminDao.regist(admin);
    }

    @Override
    public int modifyPasswordByAdminId(Admin admin) throws Exception {
        /*  String newPass = new MD5().getMD5ofStr(admin.getPassword());
        admin.setPassword(newPass);*/
        return adminDao.modifyPasswordByAdminId(admin);
    }

    @Override
    public Admin login(Admin admin) throws Exception {
      /*  String password = md5.getMD5ofStr(password);
        */
        Admin newadmin = adminDao.login(admin);
        System.out.println("newadmin="+newadmin);
        if (newadmin != null && !newadmin.equals("")) {
            return newadmin;
        }
        else {
            return null;
        }
    }
    @Override
    public List<Admin> getAllAdmin(Integer pageNum) throws Exception {
        if (pageNum == null) {
            pageNum = 1;
        } else if (pageNum <= 0) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum, 2);
        //PageHelper.startPage(第几页，每页数据);
        return adminDao.getAllAdmin();
    }

    @Override
    public Admin getAdmin(Admin admin) throws Exception {
        return adminDao.getAdmin(admin);
    }
}
