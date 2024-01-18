package com.sparta.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hellomyworld";
    }

    @GetMapping("/api/get")
    @ResponseBody
    public String get(){
        return "Get 방식입니다";
    }
    @PostMapping("/api/post")
    @ResponseBody
    public String p(){
        return "post 방식입니다";
    }
    @DeleteMapping("/api/delete")
    @ResponseBody
    public String d(){
        return "delete method 사용";
    }
}
