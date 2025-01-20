package com.avinash.madha.controllers;

import com.avinash.madha.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    HomeDao dao;

    @GetMapping("/info")
    public String getInformation() {
        return dao.fetchInformation();
    }

    @GetMapping("/collegeName")
    public String getColegeName() {
        return "Ruia College";
    }
}
