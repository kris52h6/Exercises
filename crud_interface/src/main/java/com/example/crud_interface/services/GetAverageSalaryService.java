package com.example.crud_interface.services;



import com.example.crud_interface.models.Employee;
import com.example.crud_interface.repositories.EmployeeRepository;

import java.util.List;

public class GetAverageSalaryService {

    public int getAverageSalary() {
        var employeeRepository = new EmployeeRepository();
        List<Employee> list = employeeRepository.getAllEntities();


        int totalSalary = 0;
        int amountOfEmployees = list.size();

        for (Employee e : list) {
            totalSalary += e.getSalary();
        }

        int averageSalary = totalSalary / amountOfEmployees;

        return averageSalary;
    }

    public boolean isLargerThanAverageSalary(Employee employee) {
        return employee.getSalary() > getAverageSalary();
    }

    public static void main(String[] args) {
        var getAverageSalaryService = new GetAverageSalaryService();

        getAverageSalaryService.getAverageSalary();
    }
}
