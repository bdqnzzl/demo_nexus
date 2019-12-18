package com.example.demo_springboot_conf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Autowired
    private SayHello sayHello;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return sayHello.sayHello();
    }
}
