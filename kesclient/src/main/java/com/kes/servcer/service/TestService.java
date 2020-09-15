package com.kes.servcer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("kesapp")//, fallback = UserClientFallback.class
public interface TestService  {
//    @GetMapping("/health")
    @RequestMapping(method = RequestMethod.GET, value = "/health", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String health();

//    @GetMapping("/test")
    @RequestMapping(method = RequestMethod.GET, value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test();
}

//@Component
//class UserClientFallback implements TestService {
//
//    @Override
//    public String health() {
//        return "health fallback";
//    }
//
//    @Override
//    public String test() {
//        return "test fallback";
//    }
//}
