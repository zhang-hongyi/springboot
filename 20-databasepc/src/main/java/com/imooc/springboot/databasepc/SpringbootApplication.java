package com.imooc.springboot.databasepc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 刘水镜
 * @blog https://liushuijinger.blog.csdn.net
 * @date 2019/06/02
 */
@SpringBootApplication(scanBasePackages = "com.imooc.springboot.databasepc")
@MapperScan("com.imooc.springboot.databasepc.mapper")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
