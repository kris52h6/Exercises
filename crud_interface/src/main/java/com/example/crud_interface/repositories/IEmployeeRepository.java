package com.example.crud_interface.repositories;


import com.example.crud_interface.models.Employee;
import org.springframework.web.context.request.WebRequest;

public interface IEmployeeRepository extends IRepository<Employee>{
    public void createEmployee(WebRequest data);
}
