package com.dvd.model;

import java.sql.SQLException;
import java.util.List;

public class GameLibrary implements GameLibraryInterface {
    private String username;
    private List dvdCollection;
    private List allCollection;
    private List userInfo;
    private List genreList;
    private List getAllUsers;
    private List getAllusersGame;
    private List userCollection;
    private GameLibraryDAO dao;

    public GameLibrary(String username) throws SQLException {
        this.username = username;
        this.dao = new GameLibraryDAO();
    }

    public List getDVDCollection() {
        if(dvdCollection == null){
            dvdCollection = dao.getDVDCollection(username);
        }
        return dvdCollection;
    }
    public List getAllCollection(){
        if(allCollection == null){
            allCollection = dao.getAllGames();
        }
        return allCollection;
    }

    public List getUserinfo(){
        if(userInfo == null){
            userInfo = dao.getUsersInfo(username);
        }
        return userInfo;
    }

    public GameItem addDVD(String title, String year, String genre,String semi_genre,String rating,String recense,String image) {
        GameItem item = new GameItem(title, year, genre,semi_genre,rating,recense,image);

        dao.addDVD(item);
        return item;
    }

    public GameItem addUser(String title, String year, String genre,String semi_genre,String rating,String recense,String image){
        GameItem item = new GameItem(title, year, genre,semi_genre,rating,recense,image);

        List dvds = getUserCollection();
        dvds.add(item);
        dao.addUser(item);
        return item;
    }

    public List getUserCollection(){
        if(userCollection == null){
            userCollection = dao.getUsersCollection();
        }
        return userCollection;
    }

    public List getGenres() {
        if (genreList == null) {
            genreList = dao.getGenres(username);
        }
        return genreList;
    }


    public List getGetAllUsers() {
        if(getAllUsers == null){
            getAllUsers = dao.getGetAllUsersInfo();
        }

        return getAllUsers;
    }

    public List getGetAllusersGame() {
        if(getAllusersGame == null){
            getAllusersGame = dao.getUsersGame();
        }
        return getAllusersGame;
    }

    public void addGenre(String new_genre) {
        if (!genreList.contains(new_genre) ) {
            genreList.add(new_genre);
        }
    }
}
