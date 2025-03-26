package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Value("${my.service.behavior:real-behavior}")
    private String behavior;

    public String performAction() {
        return behavior;
    }
}