package com.example.maven_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/sysHello")
    @ResponseBody
    public String  sayHello(){
        return "hello spring";
    }

}
