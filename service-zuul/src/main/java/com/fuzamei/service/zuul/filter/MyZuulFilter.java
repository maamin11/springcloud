package com.fuzamei.service.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springcloud
 * @description: 服务过滤
 * @author: Andy
 * @create: 2018-12-05 14:55
 **/
@Configuration
public class MyZuulFilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(MyZuulFilter.class);

    /**
     * filterType包括
     * pre:路由之前
     * routing:路由之时
     * post:路由只有
     * error:发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder:过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写判断逻辑，是否要过滤，这里写true，永远过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        // 获取请求的request，拿到请求的方法名和url
        logger.info(">>>>>>>>>>>>>>路由之前先走该过滤器");
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info("请求的方法：{}>>>>>>>>请求的url：{}",request.getMethod(),request.getRequestURL().toString());
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            logger.warn("token is empty!");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(201);
            try {
                requestContext.getResponse().getWriter().write("token is empty!");
            } catch (Exception e) {
                logger.info(">>>>>error>>>>>>");
            }

        }
        return null;
    }
}
