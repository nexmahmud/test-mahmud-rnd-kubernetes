package com.example.testmahmudrnd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtrlStatusCheck {

    @GetMapping(value = "/status-check")
    public String statusCheck(){
        return  "Hello";
    }
}


