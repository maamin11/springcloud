package com.fuzamei.serviceribbon.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-11-02 16:20
 **/
@Configuration
public class BeanConfig {
    private Logger logger = LoggerFactory.getLogger(BeanConfig.class);

    /**
     * 注入一个bean，并启用负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate initRestTemplate() {
        logger.info("生成一个RestTemplate实例");
        return new RestTemplate();
    }
}
