package com.fuzamei.service.feign.service;

import com.fuzamei.service.feign.errorresponse.ErrorResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 11:40
 **/
@FeignClient(value = "service-hi",fallback = ErrorResponse.class)
public interface IFeignService {

    @GetMapping(value = "/hi-client/hi/hello")
    String sayFeign(@RequestParam(value = "name") String name);
}
