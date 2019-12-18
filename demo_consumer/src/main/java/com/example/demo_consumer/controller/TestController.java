package com.example.demo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TestService;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    @Reference
    private TestService testService;
    @RequestMapping(value = "/" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        return testService.sayHello("Chenqimiao");
    }

}
