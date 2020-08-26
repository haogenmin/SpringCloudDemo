package com.haogenmin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：HaoGenmin
 * @Title :ConsumerApplication
 * @date ：Created in 2020/6/23 19:31
 * @description：
 */
@EnableFeignClients(basePackages= {"com.haogenmin.consumer.service"})
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
