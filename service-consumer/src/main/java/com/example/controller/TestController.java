package com.example.controller;

import com.example.service.ProviderFeignClient;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    //@Value("${app.description}")
    private String description;

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/call")
    public String callProvider() {
        return "Consumer收到响应：" + providerFeignClient.callHello();
    }


    @GetMapping("/config")
    public String getConfig() {
        return "读取到的配置：" + description;
    }

}