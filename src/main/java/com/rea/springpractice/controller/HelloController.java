package com.rea.springpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CRR
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }
}
