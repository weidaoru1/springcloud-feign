package com.springcloud.controller;

import com.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private TestService testService;
    @RequestMapping("/provider/test")
    public String consumerTest(){
        return testService.consumerTest();
    }
    @RequestMapping("/provider/hello/test")
    public String hello(){
        return testService.hello();
    }
}
