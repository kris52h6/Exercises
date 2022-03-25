package com.example.freemoneynoscam.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBase {
    Connection con;

    public void insert(String dataFromForm) {

        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO FreeMoney.emails (`email`)" +
                    "VALUES (?)");
            pstmt.setString(1, dataFromForm);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Connection connect() {
        try
        {
            String url = "jdbc:mysql://localhost:3306/FreeMoney";
            con = DriverManager.getConnection(url,"root","keatest");
            System.out.println("Ok, we have a connection.");
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }





}
