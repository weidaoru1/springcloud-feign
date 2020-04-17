package com.springcloud.fallback;

import com.springcloud.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestFallback implements TestService {
    @Override
    public String consumerTest() {
        return "远程服务不可用。。。";
    }

    @Override
    public String hello() {
        return "hello";
    }
}
