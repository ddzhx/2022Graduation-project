package com.javameizu.meizu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.javameizu.meizu.dao")
public class MeizuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeizuApplication.class, args);
    }

}
