package com.prometheus.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    private final HelloService helloService;

    public Hello(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        helloService.increment();
        return "hello";
    }
}
