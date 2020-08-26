package com.haogenmin.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：HaoGenmin
 * @Title :Provider_02_Application
 * @date ：Created in 2020/6/28 10:37
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Provider_02_Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider_02_Application.class,args);
    }
}
