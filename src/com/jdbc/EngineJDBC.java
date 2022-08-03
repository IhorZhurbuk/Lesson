package com.jdbc;

import com.dota2.Item;

import java.sql.*;

public class EngineJDBC {
    DBWorker worker;
    Connection connection = null;
    Statement statement = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;
    public static String names;
    public static int agility;
    public static int intelect;
    public static int strenght;
    public static int health;

    public EngineJDBC(DBWorker worker) {
        this.worker = worker;
    }

    private static final String GET_HERO = "SELECT * FROM hero WHERE h_name = '%s';";
    private static final String GET_ITEM = "SELECT * FROM items WHERE item_name_item = '%s';";
    private static final String GET_INSERT_HERO = "INSERT INTO hero(\n" +
            "    h_name,\n" +
            "    h_agility,\n" +
            "    h_strength,\n" +
            "    h_intellect,\n" +
            "    h_health\n" +
            ")\n" +
            "VALUES(?, ?, ?, ?, ?)";
    private static final String GET_INSERT_ITEM = "INSERT INTO items(\n" +
            "    item_name_item,\n" +
            "    item_agility,\n" +
            "    item_intellect,\n" +
            "    item_strength\n" +
            ")\n" +
            "VALUES(?, ?, ?, ?);";
    private static final String GET_INSERT_FIGHT = "INSERT INTO fight (\n" +
            "    fight_data,\n" +
            "    fight_log \n" +
            ")\n" +
            "VALUES(?,?);";

    public void setHero(String name, int agility, int intellect, int strength, int health) {
        connection = worker.getConnect();
        try {
            ptmt = connection.prepareStatement(GET_INSERT_HERO);
            ptmt.setString(1, name);
            ptmt.setInt(2, agility);
            ptmt.setInt(3, intellect);
            ptmt.setInt(4, strength);
            ptmt.setInt(5, health);
            ptmt.executeUpdate();
            ptmt.close();
            connection.close();
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setItem(String name, int agility, int intellect, int strength) {
        connection = worker.getConnect();
        try {
            ptmt = connection.prepareStatement(GET_INSERT_ITEM);
            ptmt.setString(1, name);
            ptmt.setInt(2, agility);
            ptmt.setInt(3, intellect);
            ptmt.setInt(4, strength);
            ptmt.executeUpdate();
            ptmt.close();
            connection.close();
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setFight(String date, String log) {
        connection = worker.getConnect();
        try {
            ptmt = connection.prepareStatement(GET_INSERT_FIGHT);
            ptmt.setString(1, date);
            ptmt.setString(2, log);
            ptmt.executeUpdate();
            ptmt.close();
            connection.close();
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void takesHero(String name) {
        connection = worker.getConnect();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(String.format(GET_HERO, name));

            while (resultSet.next()) {

                names = resultSet.getString("h_name");
                agility = resultSet.getInt("h_agility");
                intelect = resultSet.getInt("h_intellect");
                strenght = resultSet.getInt("h_strength");
                health = resultSet.getInt("h_health");

            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public Item takesItem(String name) {
        connection = worker.getConnect();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(String.format(GET_ITEM, name));

            while (resultSet.next()) {
                return new Item(resultSet.getInt("item_agility"),
                        resultSet.getInt("item_intellect"),
                        resultSet.getInt("item_strength"),
                        resultSet.getString("item_name_item"));
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
