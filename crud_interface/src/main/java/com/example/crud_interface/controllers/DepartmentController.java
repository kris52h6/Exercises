package com.example.crud_interface.controllers;

import com.example.crud_interface.models.Department;
import com.example.crud_interface.repositories.DepartmentRepository;
import com.example.crud_interface.repositories.IRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
    private final IRepository<Department> departmentRepository = new DepartmentRepository();

    @GetMapping("/departments")
    public String allDepartments(Model model){
        model.addAttribute("departments", departmentRepository.getAllEntities());
        return "departments";
    }
}
