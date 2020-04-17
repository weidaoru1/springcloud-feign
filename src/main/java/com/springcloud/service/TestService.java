package com.springcloud.service;

import com.springcloud.fallback.TestFallback;
import com.springcloud.fallback.TestFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用feign的客户端注解绑定远程服务名称
 */
//@FeignClient(name = "springcloud-provider", fallback = TestFallback.class)
@FeignClient(name = "springcloud-provider", fallbackFactory = TestFallbackFactory.class)
public interface TestService {
    @RequestMapping("/provider/test")
    public String consumerTest();
    @RequestMapping("/provider/hello/test")
    public String hello();
}
