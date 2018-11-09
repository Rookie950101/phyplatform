package com.cooperation.permission;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Springboot启动类
@SpringBootApplication
@MapperScan("com.cooperation.permission.dao") //扫描dao层接口
public class permissionstarter {
    public static void main(String[] args){
        SpringApplication.run(permissionstarter.class,args);
    }
}
