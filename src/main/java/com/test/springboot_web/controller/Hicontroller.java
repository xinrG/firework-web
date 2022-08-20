package com.test.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hicontroller {
    @RequestMapping("hi")
    public String hi(){
        return "hi";
    }

    @RequestMapping("/")
    public String fireWork(){
        return "index";
    }

}
