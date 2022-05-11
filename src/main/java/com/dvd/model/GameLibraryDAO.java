package com.dvd.model;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class GameLibraryDAO {
    private static final String GET_LIBRARY_ITEMS = "SELECT Game_name,Semi_Genre, year, Main_Genre,Rating,Recense,Image FROM users_game WHERE Login=?";

    private static final String GET_ALL_LIBRARY_ITEMS = "SELECT DISTINCT Game_name,Semi_Genre, year, Main_Genre,Rating,Recense,Image FROM games";
    private static final String GET_USERS_INFO = "SELECT User_Name,Login,Phone,Email FROM Users WHERE Login=?";

    private static final String GET_USERS_COLLECTION = "SELECT User_Name,Login,Phone,Email FROM Users ";

    private static final String GET_ALL_USERS_INFO = "SELECT Login FROM users_game ";
    private static final String GET_ALL_USERS_GAME = "SELECT Game_Name,Main_Genre,year FROM users_game WHERE Login=?";

    private static final String GET_USERS_GAME = "SELECT Login,Game_Name,Main_Genre,year,Image FROM users_game  ORDER BY Login ASC  ";

    private static final String GET_ALL_ITEMS = "SELECT Game_name,Semi_Genre, year, Main_Genre,Rating,Recense,Image FROM games";

    private static final String CREATE_DVD_ITEM = "INSERT INTO Games (Game_Id,Game_Name,Semi_Genre, year, Main_Genre,  Recense, Rating,Image) VALUES (?, ?, ?, ?, ?, ?, ?,?)";


    private static final String GET_GENRES = "SELECT DISTINCT genre FROM Item WHERE username=?";
    private static final String GET_USERNAMES = "SELECT  Login FROM users_game ";

    private static final String CREATE_USER_ITEM = "INSERT INTO Users (User_ID,User_Name, Login, Phone, Email) VALUES (?, ?, ?, ?,?)";

    private static final String URL_CONNECTION = "jdbc:mysql://127.0.0.1:3306/javaEEproject?user=root&password=Werty12345";

    private static final String GET_GAME_NEXT_ID = "SELECT COUNT(Game_ID) AS id FROM Games";
    private static final String UPDATE_ID = "UPDATE ObjectIDs SET id=? WHERE table_name=?";
    private static final String CREATE_ID = "INSERT INTO ObjectIDs (table_name, id) VALUES (?, ?)";

    public GameLibraryDAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public  List getGetAllUsersInfo() {
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_ALL_USERS_INFO);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("Login");
                String login = "";
                String phone = "";
                String email = "";
                String rating = "";
                String recense = "";
                String image="";

                GameItem gameItem = new GameItem(name, login, phone,email,rating,recense,image);
                dvdItems.add(gameItem);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }

    public  List getGetAllUsersGame(String name) {
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_ALL_USERS_GAME);
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("Game_name");
                String year = resultSet.getString("year");
                String genre = resultSet.getString("Main_Genre");
                String semi_genre = "";
                String rating = "";
                String recense = "";
                String image = "";

                GameItem gameItem = new GameItem(title, year, genre,semi_genre,rating,recense,image);
                dvdItems.add(gameItem);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }

    public List getGenres(String username) {
        List genres = new ArrayList();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_GENRES);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                genres.add(resultSet.getString("Main_genre"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return genres;
    }

    public List getDVDCollection(String username){
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            if(username.equalsIgnoreCase("admin")){
                connection = DriverManager.getConnection(URL_CONNECTION);
                preparedStatement = connection.prepareStatement(GET_ALL_LIBRARY_ITEMS);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String title = resultSet.getString("Game_name");
                    String year = resultSet.getString("year");
                    String genre = resultSet.getString("Main_Genre");
                    String semi_genre = resultSet.getString("Semi_Genre");
                    String rating = resultSet.getString("Rating");
                    String recense = resultSet.getString("Recense");
                    String image = resultSet.getString("Image");

                    GameItem gameItem = new GameItem(title, year, genre,semi_genre,rating,recense,image);
                    dvdItems.add(gameItem);

            }}
            else{
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_LIBRARY_ITEMS);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("Game_name");
                String year = resultSet.getString("year");
                String genre = resultSet.getString("Main_Genre");
                String semi_genre = resultSet.getString("Semi_Genre");
                String rating = resultSet.getString("Rating");
                String recense = resultSet.getString("Recense");
                String image = resultSet.getString("Image");

                GameItem gameItem = new GameItem(title, year, genre,semi_genre,rating,recense,image);
                dvdItems.add(gameItem);
            }}
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }

    public List getUsersCollection(){
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_USERS_COLLECTION);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("Game_name");
                String login = resultSet.getString("year");
                String phone = resultSet.getString("Main_Genre");
                String email = resultSet.getString("Semi_Genre");
                String rating = "";
                String recense = "";
                String image = "";

                GameItem gameItem = new GameItem(name, login, phone,email,rating,recense,image);
                dvdItems.add(gameItem);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }

    public List getUsersInfo(String username){
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_USERS_INFO);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if(username.equalsIgnoreCase("admin")){
                    String name = "Admin";
                    String login = "Admin";
                    String phone = "Admin";
                    String email = "Admin";
                    String rating = "";
                    String recense = "";
                    String image = "";

                    GameItem gameItem = new GameItem(name, login, phone,email,rating,recense,image);
                    dvdItems.add(gameItem);
                }
                else {
                    String name = resultSet.getString("User_Name");
                    String login = resultSet.getString("Login");
                    String phone = resultSet.getString("Phone");
                    String email = resultSet.getString("Email");
                    String rating = "";
                    String recense = "";
                    String image = "";
                    GameItem gameItem = new GameItem(name, login, phone,email,rating,recense,image);
                    dvdItems.add(gameItem);
                }

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }

    public List getUsersGame(){
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_USERS_GAME);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("Game_name");
                String year = resultSet.getString("year");
                String genre = resultSet.getString("Main_Genre");
                String login = resultSet.getString("Login");
                String rating = "";
                String recense = "";
                String image = "";

                GameItem gameItem = new GameItem(title, year, genre,login,rating,recense,image);
                dvdItems.add(gameItem);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }


    public List getAllGames(){
        List dvdItems = new ArrayList<GameItem>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_ALL_ITEMS);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("Game_name");
                String year = resultSet.getString("year");
                String genre = resultSet.getString("Main_Genre");
                String semi_genre = resultSet.getString("Semi_Genre");
                String rating = resultSet.getString("Rating");
                String recense = resultSet.getString("Recense");
                String image = resultSet.getString("Image");

                GameItem gameItem = new GameItem(title, year, genre,semi_genre,rating,recense,image);
                dvdItems.add(gameItem);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
        return dvdItems;
    }

    public void addDVD(GameItem item){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            int id = getNextID()+1;
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(CREATE_DVD_ITEM);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, item.getTitle());
            preparedStatement.setString(3, item.getSemi_genre());
            preparedStatement.setString(4, item.getYear());
            preparedStatement.setString(5, item.getGenre());
            preparedStatement.setString(6, item.getRecense());
            preparedStatement.setString(7, item.getRating());
            preparedStatement.setString(8, item.getImage());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
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
            queryStatement = connection.prepareStatement(GET_GAME_NEXT_ID);
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

    public void addUser(GameItem item){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            int id = getNextID() +1;
            String value = String.valueOf(id);
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(CREATE_USER_ITEM);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, item.getTitle());//name
            preparedStatement.setString(4, item.getGenre());//phone
            preparedStatement.setString(3, value+item.getTitle());//login
            preparedStatement.setString(5, item.getSemi_genre());//email
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection, preparedStatement, resultSet);
        }
    }

    public static List getUsernames(){
        ArrayList<String> usernames = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(URL_CONNECTION);
            preparedStatement = connection.prepareStatement(GET_USERNAMES);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                usernames.add(resultSet.getString("Login"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
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
        return usernames;
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
