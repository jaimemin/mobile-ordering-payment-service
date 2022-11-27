package com.tistory.amyyzzin.mobileorderingpaymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
