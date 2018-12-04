package com.fuzamei.service.feign.errorresponse;

import com.fuzamei.service.feign.service.IFeignService;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 16:02
 **/
@Configuration
public class ErrorResponse implements IFeignService {
    @Override
    public String sayFeign(String name) {
        return "服务调用失败";
    }
}
