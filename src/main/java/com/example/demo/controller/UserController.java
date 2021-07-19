package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Users;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
//sgq

/**
 *【需求】
 * 1.用户登陆注册
 * 2.密码找回
 * 3.会员登录
 * @Author lmwis
 */
@RestController//控制器————servlet
@RequestMapping("/user")
public class UserController {
//    private Logger log = Logger.getLogger(String.valueOf(UserController.class));
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public Map regist(@RequestParam Map<String, String> params) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        System.out.println(params);
        String username = params.get("username");
        String password = params.get("password");
        Users user = new Users(username,password);
        int answer = userService.regist(user);
        System.out.println("answer=" + answer);
        if (answer == 1) {
            meta.put("msg", "注册成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "注册失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return map;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map login(@RequestParam Map<String, String> params) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        String username = params.get("username");
        String password = params.get("password");
//        System.out.println(username);
        Users user = new Users();
        user.setUserName(username);
        user.setPassword(password);
        Users newuser = userService.login(user);
        System.out.println("answer"+newuser);
        if (newuser != null) {
            data.put("user",username);
            meta.put("msg", "登录成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "登录失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return map;
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public Map modifyPasswordByUserid(@RequestParam Map<String, String> params) throws Exception {
        Map<String, Map<String, Object>> map = new HashMap();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> meta = new HashMap<>();
        System.out.println(params);
        String userid = params.get("userid");
        String password = params.get("password");
        Users user = new Users();
        user.setUserid(Integer.parseInt(userid));
        user.setPassword(password);
        int answer = userService.modifyPasswordByUserid(user);
        System.out.println("answer=" + answer);
        if (answer == 1) {
            meta.put("msg", "修改成功");
            meta.put("status", 200);
        } else {
            meta.put("msg", "修改失败");
            meta.put("status", 300);
        }
        map.put("data", data);
        map.put("meta", meta);
        return map;
    }
}