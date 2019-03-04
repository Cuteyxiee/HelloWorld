package com.interswitch.helloworld.apitest;

import com.interswitch.helloworld.Api;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApiTest {

    @Test
    public void greetingpass() {
        String message = "Hello World";
        assertEquals(message , Api.Message());
    }

    @Test
    public void greetingfail() {
        String message = "HelloWorld";
        assertEquals(message , Api.Message());
    }
}