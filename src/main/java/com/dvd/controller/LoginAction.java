package com.dvd.controller;

import com.dvd.model.GameLibraryDAO;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.List;

import static com.opensymphony.xwork2.Action.*;

public class LoginAction {

    public String execute(){
        List<String> usernames = GameLibraryDAO.getUsernames();

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();

        String username = request.getParameter("Username");

        for(String parameter : usernames){
            if(parameter.equalsIgnoreCase(username) || username.equalsIgnoreCase("admin")){
                session.setAttribute("Username", username);
                return SUCCESS;
            }
        }

        return ERROR;
    }
}
