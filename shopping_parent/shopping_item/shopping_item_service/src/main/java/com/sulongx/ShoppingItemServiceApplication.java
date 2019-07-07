package com.sulongx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述:
 * 商品服务
 *
 * @author xiongsulong
 * @create 2019-07-05 00:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingItemServiceApplication.class,args);
    }
}
