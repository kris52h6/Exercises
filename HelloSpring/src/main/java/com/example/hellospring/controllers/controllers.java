package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.hellospring.services.calculateday;


@RestController
public class controllers {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return input;
    }

    @GetMapping("/isitfriday")
    public boolean isItFriday() {
        calculateday cd = new calculateday();
        int r = cd.calculateDay();
        return r == 5;
    }

   /* public int calculateDay() {
        int q = 15; // day
        int m = 2; // month
        int y = 2022; // year
        if (m == 1) {
            m = 13;
            y--;
        } else if (m == 2) {
            m = 14;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (q + (13 * (m+1) / 5) + k + (k/4) + (j/4) - (2*j) ) % 7;

        return ((h+5)%7) +1;

    }*/
}
