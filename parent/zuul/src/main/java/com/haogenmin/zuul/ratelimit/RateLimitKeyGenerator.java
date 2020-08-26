package com.haogenmin.zuul.ratelimit;

import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.RateLimitUtils;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.properties.RateLimitProperties;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.support.DefaultRateLimitKeyGenerator;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：HaoGenmin
 * @Title :RateLimitKeyGenerator
 * @date ：Created in 2020/8/24 14:23
 * @description：
 */
@Component
public class RateLimitKeyGenerator extends DefaultRateLimitKeyGenerator {
    public RateLimitKeyGenerator(RateLimitProperties properties, RateLimitUtils rateLimitUtils) {
        super(properties, rateLimitUtils);
    }

    @Override
    public String key(HttpServletRequest request, Route route, RateLimitProperties.Policy policy) {
        return super.key(request, route, policy)+":"+request.getMethod();
    }
}
