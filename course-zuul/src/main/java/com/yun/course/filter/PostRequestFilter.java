package com.yun.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @Author: Crush
 * @Date:2021/1/15 15:00
 * Description: 请求处理后的过滤器
 */
@Component
public class PostRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        Long startTime = (Long) requestContext.get("startTime");
        long duration = System.currentTimeMillis() - startTime;
        String requestURI = requestContext.getRequest().getRequestURI();
        System.out.println("uri:  "+ requestURI+"  处理时长： "+ duration);

        return null;
    }
}
