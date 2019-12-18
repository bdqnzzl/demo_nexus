package com.example.demo_springboot_conf.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2017/12/21.
 */
@ConfigurationProperties(prefix = "hello")
public class SayHelloProperties {
    private String helloMsg = "spring boot";

    public String getHelloMsg() {
        return helloMsg;
    }

    public void setHelloMsg(String helloMsg) {
        this.helloMsg = helloMsg;
    }
}
