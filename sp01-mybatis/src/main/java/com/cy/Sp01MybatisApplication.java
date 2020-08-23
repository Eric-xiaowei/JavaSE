package com.cy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cy.mapper")
@SpringBootApplication
public class Sp01MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp01MybatisApplication.class, args);
    }

}
