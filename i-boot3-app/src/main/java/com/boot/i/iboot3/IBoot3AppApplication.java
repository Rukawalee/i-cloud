package com.boot.i.iboot3;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableDubbo
@EnableCaching
@SpringBootApplication
public class IBoot3AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(IBoot3AppApplication.class, args);
    }

}
