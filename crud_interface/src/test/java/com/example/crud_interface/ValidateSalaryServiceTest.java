package com.example.crud_interface;

import com.example.crud_interface.models.Employee;
import com.example.crud_interface.services.ValidateSalaryService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSalaryServiceTest {

    @Test
    void validateSalary() {
        var validateSalaryService = new ValidateSalaryService();

        Employee employeeExpectedTrue = new Employee(
                1,
                "Kristian",
                "Developer",
                10,
                "2022-10-20",
                10000,
                500,
                10
        );

        Employee employeeExpectedFalse = new Employee(
                1,
                "Kristian",
                "Developer",
                10,
                "2022-10-20",
                5000,
                10000,
                10
        );

        assertTrue(validateSalaryService.validateSalary(employeeExpectedTrue));
        assertFalse(validateSalaryService.validateSalary(employeeExpectedFalse));
    }

}