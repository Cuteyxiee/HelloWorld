package com.interswitch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Api {

    @RequestMapping(value = "/api", method = GET)
    public String greeting(){
        return ("Hello World");
    }

}
