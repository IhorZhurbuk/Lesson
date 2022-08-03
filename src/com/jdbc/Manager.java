package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager {
    private final DBWorker worker;
    private static final String CREATE_TABLE_HEROES = "CREATE TABLE IF NOT EXISTS hero(\n" +
            "    h_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
            "    h_name VARCHAR(35),\n" +
            "    h_agility INT,\n" +
            "    h_intellect INT,\n" +
            "    h_strength INT,\n" +
            "    h_health INT\n" +
            ")";
    private static final String CREATE_TABLE_ITEMS = "CREATE TABLE IF NOT EXISTS items(\n" +
            "    item_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
            "    item_name_item VARCHAR(35),\n" +
            "    item_agility INT,\n" +
            "    item_intellect INT,\n" +
            "    item_strength INT\n" +
            ");";
    private static final String CREATE_TABLE_FIGHT = "CREATE TABLE IF NOT EXISTS fight(\n" +
            "    fight_round_id INT PRIMARY KEY AUTO_INCREMENT,\n" +
            "    fight_data VARCHAR(1000),\n" +
            "    fight_log VARCHAR(10000) \n" +
            ");";


    public Manager(DBWorker worker) {
        this.worker = worker;
    }

    public void createTable() {
        Connection connection = worker.getConnect();

        if (connection != null) {
            try {
                Statement statement = connection.createStatement();
                statement.execute(CREATE_TABLE_HEROES);
                statement.execute(CREATE_TABLE_ITEMS);
                statement.execute(CREATE_TABLE_FIGHT);
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Worker returned null");
        }
    }

}
