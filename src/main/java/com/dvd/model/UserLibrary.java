package com.dvd.model;

import java.sql.SQLException;
import java.util.List;

public class UserLibrary implements  UserLibraryInterface{

    private UserDAO daoGame;

    public UserLibrary() throws SQLException {

        this.daoGame = new UserDAO();
    }

    @Override
    public UserItem addUser(String name, String login, String phone, String email) {
        UserItem item = new UserItem(name, login, phone,email);

        daoGame.addUser(item);
        return item;
    }
}
