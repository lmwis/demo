package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {

    // 通过WWW 进行传参
    @RequestMapping(value = "/text2",method = RequestMethod.POST)
    public Map getInfo(@RequestParam Map<String, String> params){
        String data=params.get("id");
        System.out.println(data);
        Map map = new HashMap();
        map.put("id","孙业盛的第二次相应");
        return map;
    }

    //拼接字符串传参
    @RequestMapping(value = "textget2",method = RequestMethod.GET)
    public Map getGetInfo2(@RequestParam String name){
        Map map = new HashMap();
        map.put("name",name);
        return map; 
    }
}
