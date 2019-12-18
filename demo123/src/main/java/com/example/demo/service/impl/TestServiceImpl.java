package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import service.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {

        return "Hello " + name + "!";
    }


}