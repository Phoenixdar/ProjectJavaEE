package com.dvd.model;

import java.io.Serializable;

public class UserItem implements Serializable {
    String name;
    String login;
    String phone;
    String email;

    public UserItem(String name,String login,String phone,String email){
        this.email=email;
        this.login = login;
        this.name = name;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
