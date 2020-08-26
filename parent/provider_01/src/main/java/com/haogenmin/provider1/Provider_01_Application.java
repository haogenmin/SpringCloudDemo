package com.haogenmin.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：HaoGenmin
 * @Title :Provider_01_Application
 * @date ：Created in 2020/6/23 19:10
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Provider_01_Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider_01_Application.class,args);
    }
}
