package com.fuzamei.serviceribbon.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-11-02 16:27
 **/
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "sayHello")
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHello(@RequestParam(value = "name") String name) {
        System.out.println("++++++++++++++++++我是ribbon++++++++++++++++++");
        return restTemplate.getForObject("http://service-hi/hello?name="+name,String.class);
    }

    public String hiError(String name) {
        return "服务出现了错误，终止继续调用";
    }
}
