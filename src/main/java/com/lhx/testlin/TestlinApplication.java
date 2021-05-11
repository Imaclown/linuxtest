package com.lhx.testlin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lhx.testlin.mapper")
public class TestlinApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestlinApplication.class, args);
    }

}
