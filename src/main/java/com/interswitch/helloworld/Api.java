package com.interswitch.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api")
public class Api {

    @RequestMapping(value = "" , method = GET)
    public static String Message(){
        return ("Hello World");
    }
}
