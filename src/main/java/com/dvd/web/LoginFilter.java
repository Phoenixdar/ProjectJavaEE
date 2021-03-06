package com.dvd.web;


import com.dvd.model.GameLibrary;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebFilter
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();
        GameLibrary library = (GameLibrary) session.getAttribute("library");
        if (library == null) {
            String parameter = (String) session.getAttribute("Username");

            if (parameter == null){
                RequestDispatcher dispatcher = session.getServletContext().getRequestDispatcher("/log2.jsp");
                dispatcher.forward(request, response);
            }else {
                try {
                    library = new GameLibrary(parameter);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                session.setAttribute("library", library);
                chain.doFilter(request,response);
            }
        }else {
            chain.doFilter(request, response);
        }
    }
}

