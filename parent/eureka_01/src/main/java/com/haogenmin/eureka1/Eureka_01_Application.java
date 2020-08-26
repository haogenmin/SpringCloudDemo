package com.haogenmin.eureka1;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：HaoGenmin
 * @Title :Eureka_01_Application
 * @date ：Created in 2020/6/24 16:07
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_01_Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_01_Application.class,args);
    }
}
