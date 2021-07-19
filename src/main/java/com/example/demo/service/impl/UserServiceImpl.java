package com.example.demo.service.impl;

import java.util.List;
import java.util.logging.Logger;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import com.example.demo.utils.MD5;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//sgq
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao; // 依赖注入

    @Override
    public int regist(Users user) throws Exception {
//        String newPass = new MD5().getMD5ofStr(user.getPassword());
//        user.setPassword(newPass);
        System.out.println(user);
        return userDao.regist(user);
    }

    @Override
    public Users login(Users user) throws Exception {
        return userDao.login(user);
    }

    @Override
    public int modifyPasswordByUserid(Users user) throws Exception {

         /*  String newPass = new MD5().getMD5ofStr(user.getPassword());
        user.setPassword(newPass);*/
        return userDao.modifyPasswordByUserid(user);
    }

    @Override
    public List<Users> getAllUsers(Integer pageNum,Integer maxPage) throws Exception {

        return userDao.getAllUsers(pageNum,maxPage);
    }

    @Override
    public Users getUserByUserid(Users user) throws Exception{

        return userDao.getUserByUserid(user);
    }
    @Override
    public int modifyUserStateByUserid(Users user) throws Exception {
        if ("true".equals(user.getUserState())) {
            user.setUserState("false");
        } else {
            user.setUserState("true");
        }
        return userDao.modifyUserStateByUserid(user);
    }

}