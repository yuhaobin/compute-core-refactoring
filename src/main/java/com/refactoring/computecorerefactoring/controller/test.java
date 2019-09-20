package com.refactoring.computecorerefactoring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/test")
    @ResponseBody
    public String get(){
        return "test";
    }
}
