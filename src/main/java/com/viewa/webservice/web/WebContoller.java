package com.viewa.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebContoller {
    @GetMapping("/")
    public String name() {
        return "main";
    }
}