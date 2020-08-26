package com.haogenmin.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：HaoGenmin
 * @Title :Eureka_02_Application
 * @date ：Created in 2020/6/28 8:40
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_02_Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_02_Application.class,args);
    }
}
