package com.example.crud_interface.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontPageController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}