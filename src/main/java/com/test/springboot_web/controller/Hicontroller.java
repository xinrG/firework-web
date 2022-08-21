package com.test.springboot_web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Hicontroller {
    Logger logger = LoggerFactory.getLogger(Hicontroller.class);

    @RequestMapping("hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/")
    public String fireWork() {

        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
            logger.info("firework request, addr={} host={}", request.getRemoteAddr(), request.getRemoteHost());
            return "index";
        } catch (Exception e) {
            logger.error("firework request exception", e);
        }
        return "error";
    }

}
