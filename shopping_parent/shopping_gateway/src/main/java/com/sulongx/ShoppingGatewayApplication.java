package com.sulongx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述:
 * 微服务网关
 *
 * @author xiongsulong
 * @create 2019-07-04 23:20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ShoppingGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingGatewayApplication.class,args);
    }
}
