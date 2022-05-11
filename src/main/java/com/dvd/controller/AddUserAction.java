package com.dvd.controller;


import com.dvd.model.GameLibrary;
import com.dvd.model.GameItem;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class AddUserAction extends ActionSupport {
    @Override
    public String execute(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();

        try {
            String name = request.getParameter("name").trim();
            String login = "";
            String phone = request.getParameter("phone").trim();
            String email = request.getParameter("email").trim();
            String rating = "";
            String recense = "";
            String image = "";




            GameLibrary gameLibrary = (GameLibrary) session.getAttribute("library");
            GameItem gameItem = gameLibrary.addUser(name, login, phone,email,rating,recense,image);
            session.setAttribute("dvdItem", gameItem);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }



        return SUCCESS;
    }
}
