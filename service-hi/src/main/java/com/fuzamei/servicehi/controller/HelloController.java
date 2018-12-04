package com.fuzamei.servicehi.controller;


import com.fuzamei.servicehi.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-11-02 11:02
 **/
@RestController
@RequestMapping(value = "/hi")
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @Value(value = "${server.port}")
    private String port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name) {
        return helloService.hello(name,port);
    }

}
