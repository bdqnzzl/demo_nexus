package com.example.demo_springboot_conf.demo;

/**
 * Created by Administrator on 2017/12/21.
 */
public class SayHello {
    private String helloMsg;
    public String sayHello(){
        return "hello" + helloMsg;
    }

    public String getHelloMsg() {
        return helloMsg;
    }

    public void setHelloMsg(String helloMsg) {
        this.helloMsg = helloMsg;
    }
}
