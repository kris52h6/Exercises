package com.example.crud_interface.models;

import java.util.Date;

public class Employee {
    private int id;
    private String employeeName;
    private String job;
    private int manager;
    private String hireDate;
    private int salary;
    private int commission;
    private int departmentNumber;

    public Employee(int id, String employeeName, String job, int manager, String hireDate, int salary, int commission, int departmentNumber) {
        this.id = id;
        this.employeeName = employeeName;
        this.job = job;
        this.manager = manager;
        this.hireDate = hireDate;
        this.salary = salary;
        this.commission = commission;
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getJob() {
        return job;
    }

    public int getManager() {
        return manager;
    }

    public String getHireDate() {
        return hireDate;
    }

    public int getCommission() {
        return commission;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", job='" + job + '\'' +
                ", manager='" + manager + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", commission=" + commission +
                ", departmendNumber=" + departmentNumber +
                '}';
    }

}
