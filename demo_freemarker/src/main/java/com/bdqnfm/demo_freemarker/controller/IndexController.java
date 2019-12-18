package com.bdqnfm.demo_freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/list")
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView("/test");
        modelAndView.addObject("name","老铁");
        return modelAndView;
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name", "[Angel -- 守护天使]");
        return "hello";
    }
}
