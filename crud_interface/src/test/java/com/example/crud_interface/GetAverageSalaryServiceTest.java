package com.example.crud_interface;

import com.example.crud_interface.models.Employee;
import com.example.crud_interface.services.GetAverageSalaryService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetAverageSalaryServiceTest {

    @Test
    void salaryIsLargerThanAverage() {
        var getAverageSalaryService = new GetAverageSalaryService();

        Employee employeeExpectTrue = new Employee(
                1,
                "Kristian",
                "Developer",
                10,
                "2022-10-20",
                10000,
                500,
                10
        );

        Employee employeeExpectFalse = new Employee(
                1,
                "Kristian",
                "Developer",
                10,
                "2022-10-20",
                500,
                500,
                10
        );

        assertTrue(getAverageSalaryService.isLargerThanAverageSalary(employeeExpectTrue));
        assertFalse(getAverageSalaryService.isLargerThanAverageSalary(employeeExpectFalse));

    }

}