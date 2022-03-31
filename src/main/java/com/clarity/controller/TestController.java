package com.clarity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testHello")
    public String testHello() {
        return "自己的博客制作前的环境测试";
    }
}
