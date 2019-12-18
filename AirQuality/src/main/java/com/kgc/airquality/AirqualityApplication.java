package com.kgc.airquality;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kgc.airquality.dao")
public class AirqualityApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirqualityApplication.class, args);
    }

}
