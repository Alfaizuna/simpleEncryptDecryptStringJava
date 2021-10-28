package com.encryptdecrypt.testjava.controller;

import com.encryptdecrypt.testjava.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class RestApiControllerTest {

    @Autowired
    RestApiService restApiService;

    @PostMapping(value = "/encrypt")
    public String encryptString(@RequestParam String string){
        return restApiService.encrypt(string);
    }

    @PostMapping(value = "/decrypt")
    public String decryptString(@RequestParam String string){
        return restApiService.decrypt(string);
    }
}
