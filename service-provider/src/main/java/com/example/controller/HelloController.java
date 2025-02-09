package com.example.controller;

import com.example.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    ProviderService providerService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return providerService.getInfo() + port;
    }

}
