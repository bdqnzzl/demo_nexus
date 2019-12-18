package com.bdqn.demo_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() throws Exception{
        return "hello springboot!!";
    }

    @RequestMapping("ajax_method")
    @ResponseBody
    public HashMap<String,String> ajax_method() throws Exception{
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("str","hello springboot!!");
        return map;
    }
}
