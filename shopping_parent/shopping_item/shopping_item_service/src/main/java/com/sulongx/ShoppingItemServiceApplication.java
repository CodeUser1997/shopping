package com.sulongx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 描述:
 * 商品服务启动入口
 *
 * @author xiongsulong
 * @create 2019-07-21 17:17
 */
@MapperScan("com.sulongx.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingItemServiceApplication.class,args);

    }
}
