package com.ljp.ycu.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljp.ycu.mybatis.dao")  //此处为测试家的注解，可取=去掉
public class YcuMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(YcuMybatisApplication.class, args);
    }

}
