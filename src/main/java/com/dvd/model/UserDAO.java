package com.dvd.model;

import java.sql.*;

public class UserDAO {
    private static final String CREATE_USER_ITEM = "INSERT INTO Users (User_ID,User_Name, Login, Phone, Email) VALUES (?, ?, ?, ?,?)";
    private static final String GET_NEXT_ID = "SELECT MAX(User_ID) AS id FROM users";
    private static final String URL_CONNECTION = "jdbc:mysql://127.0.0.1:3306/javaEEproject?user=root&password=Werty12345";

    public UserDAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public int getNextID() {
        int id = 1;
        Connection connection = null;
        PreparedStatement queryStatement = null;
        PreparedStatement updateStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            queryStatement = connection.prepareStatement(GET_NEXT_ID);
            resultSet = queryStatement.executeQuery();
            while(resultSet.next()) {
                id = resultSet.getInt("id");
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if(resultSet != null) {
                try { resultSet.close(); } catch (Exception e) { e.printStackTrace(); }
            }
            if(queryStatement != null) {
                try { queryStatement.close(); } catch (Exception e) { e.printStackTrace(); }
            }
            if(updateStatement != null) {
                try { updateStatement.close(); } catch (Exception e) { e.printStackTrace(); }
            }
            if(connection != null) {
                try { connection.close(); } catch (Exception e) { e.printStackTrace(); }
            }
        }
        return id;
    }

    public void addUser(UserItem item){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            int id = getNextID() ;
            String value = String.valueOf(id);
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(CREATE_USER_ITEM);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, item.getName());//name
            preparedStatement.setString(4, item.getPhone());//phone
            preparedStatement.setString(3, value+item.getLogin());//login
            preparedStatement.setString(5, item.getEmail());//email
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
    }

    private void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        if(resultSet!=null){
            try{
                resultSet.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(preparedStatement!=null){
            try{
                preparedStatement.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try{
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
