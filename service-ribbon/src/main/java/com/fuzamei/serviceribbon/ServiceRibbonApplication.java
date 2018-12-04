package com.fuzamei.serviceribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ServiceRibbonApplication {
    private static Logger logger = LoggerFactory.getLogger(ServiceRibbonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
        logger.info("启动完成");
    }
}
