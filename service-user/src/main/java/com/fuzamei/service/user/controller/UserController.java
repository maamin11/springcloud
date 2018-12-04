package com.fuzamei.service.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 17:24
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/addUser")
    public String addUser(@RequestParam(value = "name") String name) {
        return "user-service-addUser-success";
    }
}
