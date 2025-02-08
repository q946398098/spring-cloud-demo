package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-provider") // 对应服务提供者的应用名称
public interface ProviderFeignClient {

    @GetMapping("/api/hello")
    String callHello();
}
