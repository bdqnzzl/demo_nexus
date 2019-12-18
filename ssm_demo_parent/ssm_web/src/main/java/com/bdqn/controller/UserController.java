package com.bdqn.controller;

import com.bdqn.entity.User;
import com.bdqn.sevice.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("list")
    public String getUser(Model model)throws Exception{
        User user = userServiceImpl.method1();
        model.addAttribute("user",user);
        return "list";
    }



}
