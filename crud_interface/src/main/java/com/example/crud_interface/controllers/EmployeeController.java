package com.example.crud_interface.controllers;

import com.example.crud_interface.repositories.EmployeeRepository;
import com.example.crud_interface.repositories.IEmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class EmployeeController {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @GetMapping("/employees")
    public String allEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.getAllEntities());
        return "employees";
    }

    @GetMapping("/employee")
    public String singleEmployee(Model model, @RequestParam int id) {
        model.addAttribute("employee", employeeRepository.getSingleById(id));
        return "single-employee";
    }

    @GetMapping("/employeeForm")
    public String employeeForm() {
        return "create-employee";
    }

    @PostMapping("/createEmployee")
    public String createEmployee(WebRequest dataFromForm) {
        employeeRepository.createEmployee(dataFromForm);
        return "redirect:/employees";
    }
}
