package com.designdreams.copass.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingService {

    @RequestMapping("/ping")
    public String welcomeMsg() {
        return "welcome";
    }

}
