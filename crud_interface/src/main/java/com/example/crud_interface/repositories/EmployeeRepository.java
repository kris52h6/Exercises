package com.example.crud_interface.repositories;


import com.example.crud_interface.models.Employee;
import com.example.crud_interface.utility.DatabaseConnectionManager;
import org.springframework.web.context.request.WebRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {


    @Override
    public List<Employee> getAllEntities() {
        Connection conn = DatabaseConnectionManager.getConnection();
        List<Employee> list = new ArrayList<>();

        try {
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Employee temp = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8)
                );

                list.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Employee getSingleById(int id) {
        Connection conn = DatabaseConnectionManager.getConnection();

        try {
            PreparedStatement pstmt = conn.prepareStatement("SElECT * FROM employees WHERE id = "+ id + ";");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Employee temp = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8)
                );
                return temp;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean create(Employee entity) {
        Connection conn = DatabaseConnectionManager.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees (employee_name, job, manager, hiredate, commission, department_number)" +
                    " VALUES (?,?,?,?,?,?)");
            stmt.setString(1, entity.getEmployeeName());
            stmt.setString(2, entity.getJob());
            stmt.setInt(3, entity.getManager());
            stmt.setString(4, entity.getHireDate());
            stmt.setInt(5, entity.getCommission());
            stmt.setInt(6, entity.getDepartmentNumber());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void createEmployee(WebRequest data) {
        LocalDate date = LocalDate.now();
        String dateString = date.toString();

        Employee temp = new Employee(
                // placeholder id, will be incremented automatically when insert in db
                1,
                data.getParameter("employeeName"),
                data.getParameter("job"),
                Integer.parseInt(data.getParameter("manager")),
                dateString,
                1000, // template salary
                Integer.parseInt(data.getParameter("commission")),
                Integer.parseInt(data.getParameter("departmentNumber"))
        );


        System.out.println(temp);
        create(temp);
        //TODO
        // Create employee and call create()
        // Add employee to db
    }


    public static void main(String[] args) {
        EmployeeRepository er = new EmployeeRepository();

        List<Employee> list = er.getAllEntities();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        Employee e = er.getSingleById(7521);
        System.out.println(e);
    }


}
