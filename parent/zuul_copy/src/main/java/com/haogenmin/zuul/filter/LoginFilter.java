package com.haogenmin.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author ：HaoGenmin
 * @Title :LoginFilter
 * @date ：Created in 2020/8/20 15:48
 * @description：
 */
@Component
public class LoginFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //1.获取请求上下文
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        //如果说请求带了token值，则表示已经登录过
        if(token == null) {
            logger.warn("此操作需要先登录系统");
            //没有登录 过，则不进行路由转发
            context.setSendZuulResponse(false);//拒绝访问
            context.setResponseStatusCode(200); //响应状态码
            try {
                context.getResponse().getWriter().write("token is empty...");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        //通过，会进行路由转发
        logger.info("zuul_copy----------------通过，会进行路由转发");
        return null;
    }
}
