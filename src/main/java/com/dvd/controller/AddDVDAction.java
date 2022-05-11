package com.dvd.controller;


import com.dvd.model.GameLibrary;
import com.dvd.model.GameItem;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

public class AddDVDAction extends ActionSupport {
    @Override
    public String execute(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();

        List<String> errorMsgs = new ArrayList<>();
        request.setAttribute("errorMsgs", errorMsgs);
        try {
            String year = request.getParameter("year").trim();
            String title = request.getParameter("title").trim();
            String genre = request.getParameter("genre").trim();
            String semiGenre = request.getParameter("semiGenre").trim();
            String rating = request.getParameter("rating").trim();
            String recense = request.getParameter("recense").trim();
            String image = "";


            GameLibrary GameLibrary = (GameLibrary) session.getAttribute("library");
            GameItem gameItem = GameLibrary.addDVD(title, year, genre,semiGenre,rating,recense,image);
            session.setAttribute("dvdItem", gameItem);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

        return SUCCESS;

    }
}

