package com.tistory.amyyzzin.mobileorderingpaymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {

    /**
     * sidebar toggle 참고: https://codesandbox.io/s/fb4qc?file=/index.html:0-7911
     *
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
