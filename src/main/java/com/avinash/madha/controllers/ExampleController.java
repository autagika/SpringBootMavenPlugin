package com.avinash.madha.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){
        Map<String, Object> returnval = new HashMap<>();

        System.out.println("This is Ashish Utagikar");
        System.out.println("I live in Sanford Florida");

        returnval.put("hello", "world");

        return returnval;
    }
}
