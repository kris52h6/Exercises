package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.models.User;
import com.example.freemoneynoscam.services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.ui.Model;


@Controller
public class IndexController {
    Services emailServices = new Services();



    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        emailServices.processEmail(dataFromForm);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success() {
        return ("success");
    }


}
