package com.haogenmin.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author ：HaoGenmin
 * @Title :ZuulApplication
 * @date ：Created in 2020/8/20 11:04
 * @description：
 */
@SpringBootApplication
@EnableZuulProxy
@EnableRetry
public class ZuulCopyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulCopyApplication.class,args);
    }
}
