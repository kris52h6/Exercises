package com.example.freemoneynoscam.services;

import com.example.freemoneynoscam.models.User;
import com.example.freemoneynoscam.repositories.DataBase;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

public class Services {

    DataBase db = new DataBase();

    public void processEmail(WebRequest dataFromForm) {
        String data = dataFromForm.getParameter("email");
        ValidateEmailService validateService = new ValidateEmailService();
        boolean isValid = validateService.isEmailValid(data);
        if (isValid) {
            db.connect();
            db.insert(data);
        } else {
            System.out.println("Email is invalid");
        }
    }

}
