package com.atxfb.xfbserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.atxfb.mapper")
@ComponentScan(basePackages = {"com.atxfb"})
public class XfbServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XfbServerApplication.class, args);
    }

}
