package com.example.freemoneynoscam.repositories;


import com.example.freemoneynoscam.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmailRepository {
    DataBase db = new DataBase();

    public User fetchSingleEmail() {
        ArrayList<User> userList = addDataToUserList();
        return userList.get(0);
    }

    public ArrayList<User> fetchAllEmails() {
        return addDataToUserList();
    }

    public ArrayList<User> addDataToUserList() {
        ArrayList<User> userList = new ArrayList<>();
        try {
            db.connect();
            ResultSet rs = fetchDB();

            while (rs.next()) {
                String col1 = rs.getString("email");
                User newUser = new User(col1);
                userList.add(newUser);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    public ResultSet fetchDB() {
            Connection connectionToDB = db.connect();
            String query = "SELECT * FROM FreeMoney.emails";
            try {
                PreparedStatement ps = connectionToDB.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                return rs;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }

}
