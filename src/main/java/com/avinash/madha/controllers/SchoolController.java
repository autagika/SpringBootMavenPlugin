package com.avinash.madha.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
    @GetMapping("/name")
    public String getSchoolName() {
        return "Gurukul High School";
    }
}
