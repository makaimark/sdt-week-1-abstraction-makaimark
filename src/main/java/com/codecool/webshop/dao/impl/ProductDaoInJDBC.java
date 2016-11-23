package com.codecool.webshop.dao.impl;

import com.codecool.webshop.dao.ProductDao;
import com.codecool.webshop.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by makaimark on 2016.11.23..
 */
public class ProductDaoInJDBC implements ProductDao {

    private static final String DATABASE = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USER = "makaimark";
    private static final String DB_PASSWORD = "920410";

    @Override
    public void add(Product p) {
        String query = "INSERT INTO afternoonsession (id, name, price) " +
                "VALUES ('" + p.getId() + "', '" + p.getName() + "', '" + p.getPrice() + "');";
        executeQuery(query);
    }

    @Override
    public List<Product> list() {
        String query = "SELECT * FROM afternoonsession;";

        List<Product> resultList = new ArrayList<>();

        try (Connection connection = getConnection();
             Statement statement =connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
        ){
            while (resultSet.next()){
                Product actTodo = new Product(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("price"));
                resultList.add(actTodo);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultList;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DATABASE,
                DB_USER,
                DB_PASSWORD);
    }

    private void executeQuery(String query) {
        try (Connection connection = getConnection();
             Statement statement =connection.createStatement();
        ){
            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
