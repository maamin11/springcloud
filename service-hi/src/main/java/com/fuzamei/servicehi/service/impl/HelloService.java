package com.fuzamei.servicehi.service.impl;

import com.fuzamei.servicehi.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 15:46
 **/
@Service
public class HelloService implements IHelloService {

    @Override
    public String hello(String name, String port) {
        return "hello,"+name+":"+port;
    }
}
