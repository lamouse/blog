package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@ComponentScan(basePackages = {"com.blog", "com.blog.service.impl", "com.blog.service"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.**.dao")
@EnableEurekaServer
@EnableTransactionManagement
public class ServerMain {
    public static void main(String[] args) {
        SpringApplication.run(ServerMain.class, args);
    }
}
