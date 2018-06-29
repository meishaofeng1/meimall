package com.example.meimall.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello,Spring Boot!";
    }


}
