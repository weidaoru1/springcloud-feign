package com.springcloud.fallback;

import com.springcloud.service.TestService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TestFallbackFactory implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        return new TestService() {
            @Override
            public String consumerTest() {
                return throwable.getMessage();
            }

            @Override
            public String hello() {
                return throwable.getMessage();
            }
        };
    }
}
