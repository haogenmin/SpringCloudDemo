package com.haogenmin.config;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：HaoGenmin
 * @Title :ConfigApplication
 * @date ：Created in 2020/8/24 16:37
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
