package com.example.controller;

import com.example.service.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/call")
    public String callProvider() {
        return "Consumer收到响应：" + providerFeignClient.callHello();
    }
}