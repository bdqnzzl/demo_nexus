package com.example.demo_springboot_conf.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/21.
 */
@Configuration
@EnableConfigurationProperties({SayHelloProperties.class})
@ConditionalOnClass({SayHello.class})
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class SayHelloAutoConfigration {
    @Resource
    private SayHelloProperties sayHelloProperties;
    @Bean
    @ConditionalOnMissingBean({SayHello.class})
    public SayHello sayHello(){
        SayHello sayHello = new SayHello();
        sayHello.setHelloMsg(sayHelloProperties.getHelloMsg());
        return sayHello;
    }
}
