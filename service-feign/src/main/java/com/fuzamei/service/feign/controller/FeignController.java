package com.fuzamei.service.feign.controller;

import com.fuzamei.service.feign.service.IFeignService;
import org.aspectj.lang.annotation.AdviceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 11:39
 **/
@RestController
public class FeignController {

    @Autowired
    private IFeignService iFeignService;

    @GetMapping(value = "/sayFeign")
    public String sayFeign(@RequestParam(value = "name") String name) {
        System.out.println("++++++++++++++++++我是feign++++++++++++++++++");
        return iFeignService.sayFeign(name);
    }
}
