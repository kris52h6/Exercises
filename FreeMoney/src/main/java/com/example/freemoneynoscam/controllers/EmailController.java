package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.models.User;
import com.example.freemoneynoscam.repositories.EmailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class EmailController {
    EmailRepository emailRepo = new EmailRepository();

    @GetMapping("/email")
    public String fetchSingleEmail(Model model) {
        emailRepo.addDataToUserList();
        User userToDisplay = emailRepo.fetchSingleEmail();
        model.addAttribute("email", userToDisplay);
        return "email";
    }

    @GetMapping("/emails")
    public String fetchAllEmails(Model model) {
        ArrayList<User> userList = emailRepo.fetchAllEmails();
        model.addAttribute("emails", userList);
        return "email";
    }

}
