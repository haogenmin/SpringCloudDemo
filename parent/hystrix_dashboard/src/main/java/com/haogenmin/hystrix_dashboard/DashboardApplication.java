package com.haogenmin.hystrix_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：HaoGenmin
 * @Title :DashboardApplication
 * @date ：Created in 2020/7/30 13:29
 * @description：
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class,args);
    }
}
