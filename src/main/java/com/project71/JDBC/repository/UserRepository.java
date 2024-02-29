package com.project71.JDBC.repository;

import com.project71.JDBC.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    private Connection connection = null;
    private static final String CREATE_USER = "INSERT INTO users(id,username,password,email,firstname,lastname,gender,age,city)" + "values(default,?,?,?,?,?,?,?,?)";
    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";
    private static final String UPDATE_USER = "UPDATE users SET username=?, password=?, email=?, age=? WHERE id=?";

    public UserRepository() {
        try {
            //1. Регистрация драйвера
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_project71", "postgres", "root");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public boolean createUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getFirstname());
            preparedStatement.setString(5, user.getLastname());
            preparedStatement.setString(6, user.getGender());
            preparedStatement.setInt(7, user.getAge());
            preparedStatement.setString(8, user.getCity());
            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteUser(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_USER);
            statement.setLong(1, id);
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_USER);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setInt(4, user.getAge());
            statement.setLong(5, user.getId());
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

}