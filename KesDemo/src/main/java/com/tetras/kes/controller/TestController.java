package com.tetras.kes.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/health")
    public String health(){
        log.info("server health");
        return "hello2";
    }

    @GetMapping("/test")
    public String test(){
        log.info("server test");
        return "test2";
    }
}
