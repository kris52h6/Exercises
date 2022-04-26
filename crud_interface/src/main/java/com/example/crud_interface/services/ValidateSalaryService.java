package com.example.crud_interface.services;

import com.example.crud_interface.models.Employee;

public class ValidateSalaryService {
    public boolean validateSalary(Employee employee) {
        if(employee.getCommission() > employee.getSalary())
            return false;

        return true;
    }
}
