package com.example.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class ProviderService implements DemoService {
    public String getInfo() {
        return "Hello from provider, port: ";
    }
}
