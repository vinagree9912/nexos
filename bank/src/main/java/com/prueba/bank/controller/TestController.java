package com.prueba.bank.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastName}")
    private String lastName;
    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("Hello " + name + " " + lastName, HttpStatus.OK);
    }
}
