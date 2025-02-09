package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class ProviderService {
    public String getInfo() {
        return "Hello from provider, port: ";
    }
}
