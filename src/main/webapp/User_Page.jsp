
<%@ page import="com.dvd.model.GameLibrary" %>
<%@ page import="java.util.List" %>
<%@ page import="com.dvd.model.GameItem" %>
<!DOCTYPE html >
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>User Page</title>
    <meta name="keywords"  />
    <meta name="description"  />
    <style>
        <%@include file="resources/home_css.css"%>
    </style>

    <style type="text/css">

        body {
            margin: 0;
            padding: 0;
            line-height: 1.5em;
            font-family: Arial, Helvetica, sans-serif;
            font-size: 12px;
            color: #999;
            background: #272525 url('img/Acb.jpg');
        }
        #templatemo_wrapper_outer{
            background-image: url('img/Acb.jpg');
        }
        .rc_btn_01 a {
            clear: both;
            display: block;
            width: 120px;
            height: 25px;
            padding: 5px 0 0 0;
            font-size: 12px;
            text-align: center;
            color: #000000;
            text-decoration: none;
            border: none;
            background-color: #a1b4b4;

        }
        #templatemo_wrapper_inner {
            width: 980px;
            margin: 0 auto;
            padding: 0 5px;

        }

        #templatemo_banner {
            width: 980px;
            height: 250px;
            background: url('img/templatemo_banner_bg.jpg') no-repeat;
        }
        #templatemo_menu {
            clear: both;
            width: 500px;
            height: 65px;
            padding: 0 240px;
            background: url('img/templatemo_menu_bg.jpg') no-repeat;
        }



    </style>

</head>
<body >

<%
    GameLibrary gameLibrary = (GameLibrary) session.getAttribute("library");
    List<GameItem> gameItems = gameLibrary.getUserinfo();

    GameLibrary gameLibrary1 = (GameLibrary) session.getAttribute("library");
    List<GameItem> gameItems1 = gameLibrary.getDVDCollection();

%>




<div id="templatemo_wrapper_outer">
    <div id="templatemo_wrapper_inner">

        <div id="templatemo_banner"></div> <!-- end of banner -->
        <div class="layer" >
            <div id="templatemo_menu" >
                <ul>
                    <li><a href="HomePage.jsp" >Home</a></li>
                    <li><a href="games_list.jsp">Games</a></li>
                    <li><a href="Users_Games.jsp">User Game List</a></li>
                    <li><a href="User_Page.jsp" class="current">User Page</a></li>
                    <li><a href="Connect_Us.jsp">Contact</a></li>
                </ul>
            </div> <!-- end of menu -->

            <div id="templatemo_content_wrapper">

                <div class="templatemo_side_bar margin_right_10">

                    <div class="header_01">Games by Platform</div>
                    <ul>
                        <li><a href="HomePage.jsp#action">Action</a></li>
                        <li><a href="HomePage.jsp#fight">Fighting</a></li>
                        <li><a href="HomePage.jsp#rpg">RPG</a></li>
                        <li><a href="HomePage.jsp#arcade">Arcade</a></li>
                        <li><a href="https://www.twitch.tv/">Twitch</a></li>
                        <li><a href="https://twitter.com/">Twitter</a></li>
                        <li><a href="https://www.youtube.com/?hl=RU">YouTube</a></li>
                        <li><a href="https://store.steampowered.com/?l=russian">Steam</a></li>
                    </ul>

                    <div class="margin_bottom_20 horizontal_divider" ></div>
                    <div class="margin_bottom_20"></div>


                    <div class="margin_bottom_20"></div>
                </div> <!-- end of left side bar -->

                <div class="templatemo_content margin_right_10">
                    <div id="scroll-layer1">
                        <%for(GameItem gameItem:gameItems1) { %>
                        <div class="content_section">
                            <div class="header_02"></div>
                            <div class="image_wrapper_01"><img src="<%=gameItem.getImage()%>" alt="image"  style="width: 150px"/></div>
                            <p><h1><%=gameItem.getTitle()%></h1></p>
                            <p>Year: <%=gameItem.getYear()%></p>
                            <p>Genres: <%=gameItem.getGenre()%>,<%=gameItem.getSemi_genre()%></p>
                            <p>Rate: <%=gameItem.getRating()%></p>
                            <p>Review: <%=gameItem.getRecense()%></p>
                            <div class="margin_bottom_20"></div>
                            <div class="rc_btn_01 fl"><a href="https://en.wikipedia.org/wiki/Arcade_game">Read More</a></div>

                            <div class="cleaner"></div>
                        </div>

                        <%}%>






                        <div class="margin_bottom_20 horizontal_divider"></div>
                        <div class="margin_bottom_20"></div>





                    </div>
                </div>
                <!-- end of content -->

                <div class="templatemo_side_bar">

                    <div class="header_01" style = "text-align: center;"><h1>User Info</h1></div>
                    <%for(GameItem gameItem:gameItems) { %>
                    <div class="latest_news" style="text-align: center;">

                        <div class="header_03">Login: <%=gameItem.getYear()%></div>
                            <div class="header_03">Name: <%=gameItem.getTitle()%></div>
                                <div class="header_03">Phone: <%=gameItem.getGenre()%></div>
                                    <div class="header_03">Email: <%=gameItem.getSemi_genre()%></div>
                    </div>

                    <%}%>
                    <div class="margin_bottom_20 horizontal_divider"></div>
                    <div class="margin_bottom_20"></div>

                </div> <!-- end of right side bar -->

                <div class="cleaner"></div>
            </div> <!-- end of content wrapper -->

        </div>
    </div>
</div>
<div id="templatemo_footer">
    Copyright © 2048 <a href="#">Your Company Name</a> | <a href="http://www.iwebsitetemplate.com" target="_parent">Website Templates</a> by <a href="http://www.templatemo.com" target="_parent">Free CSS Templates</a>
</div> <!-- end of footer -->
<div class="margin_bottom_10"></div>

</body>
</html>