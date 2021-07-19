package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;
import java.util.Map;
//sgq
public interface UserService {

    public int regist(Users user) throws Exception;

    public Users login(Users user) throws Exception;

    public int modifyPasswordByUserid(Users user) throws Exception;

    public List<Users> getAllUsers(Integer pageNum,Integer maxPage) throws Exception;

    public int modifyUserStateByUserid(Users user) throws Exception;

    public Users getUserByUserid(Users user) throws Exception;

}
