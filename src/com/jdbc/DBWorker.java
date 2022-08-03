package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    public DBWorker() {
        System.out.println("Try to load driver");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Error loading driver");
        }

    }

    public Connection getConnect() {
        Connection conn = null;
        System.out.print("Obtaining connection...");
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/dota2?" +
                            "user=root&password=");
            System.out.println("Success");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }
}
