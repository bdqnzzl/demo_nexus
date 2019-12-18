package com.example.maven_demo.controller;

import com.example.maven_demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private User user;

    @RequestMapping("/getuser")
    @ResponseBody
    public String getUser(){
        return user.toString();
    }
}
