package com.ceytest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CeytestController {

    @GetMapping("/hello")
    public String sayHello(HttpServletResponse response) {
        return "hello";
    }

    @PostMapping("/baeldung")
    public String sayHelloPost(HttpServletResponse response) {
        return "hello";
    }
}
