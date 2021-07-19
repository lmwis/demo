package com.example.demo.service;

import com.example.demo.entity.Admin;

import java.util.List;

public interface AdminService {
    public int regist(Admin admin) throws Exception;

    public int modifyPasswordByAdminId(Admin admin) throws Exception;

    public Admin login(Admin admin) throws Exception;

    public List<Admin> getAllAdmin(Integer pageNum) throws Exception;

    public Admin getAdmin(Admin admin) throws Exception;
}
