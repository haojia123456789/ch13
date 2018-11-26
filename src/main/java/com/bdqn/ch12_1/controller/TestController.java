package com.bdqn.ch12_1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    public String show(){
        System.out.println("hello");
        return "hello";
    }
    public String aa(){
        System.out.println("hello");
        return "aa";
    }
}
