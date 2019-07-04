package com.sulongx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述:
 * 注册中心server
 *
 * @author xiongsulong
 * @create 2019-07-04 19:50
 */
@SpringBootApplication
@EnableEurekaServer
public class ShoppingRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingRegistryApplication.class,args);
    }
}
