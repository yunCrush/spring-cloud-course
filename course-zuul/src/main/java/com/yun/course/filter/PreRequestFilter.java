package com.yun.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @Author: Crush
 * @Date:2021/1/15 14:54
 * Description: 记录请求的时间
 */
@Component
public class PreRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
//  过滤器的类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
//  过滤器顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
//  过滤器是否启动，可以进行复杂业务逻辑
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//  核心过滤器的内容
        RequestContext requestContext = RequestContext.getCurrentContext();
//  获取系统当前时间
        requestContext.set("startTime", System.currentTimeMillis());
        System.out.println("过滤器记录时间");
        return null;
    }
}
