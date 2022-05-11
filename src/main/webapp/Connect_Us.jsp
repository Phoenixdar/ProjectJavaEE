<!DOCTYPE html >
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Contact page</title>
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
            background: #272525 url('img/background.jpg');
        }
        #templatemo_wrapper_outer{
            background-image: url('img/background.jpg');
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
<div id="templatemo_wrapper_outer">
    <div id="templatemo_wrapper_inner">

        <div id="templatemo_banner"></div> <!-- end of banner -->
        <div class="layer" >
        <div id="templatemo_menu" >
            <ul>
                <li><a href="HomePage.jsp" >Home</a></li>
                <li><a href="games_list.jsp">Games</a></li>
                <li><a href="Users_Games.jsp">User Game List</a></li>
                <li><a href="User_Page.jsp">User Page</a></li>
                <li><a href="Connect_Us.jsp"class="current">Contact</a></li>
            </ul>
        </div> <!-- end of menu -->

        <div id="templatemo_content_wrapper">

            <div class="templatemo_side_bar margin_right_10">

                <div class="header_01">Games by Platform</div>
                <ul>
                    <li><a href="#action">Action</a></li>
                    <li><a href="#fight">Fighting</a></li>
                    <li><a href="#rpg">RPG</a></li>
                    <li><a href="#arcade">Arcade</a></li>
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

                <div class="content_section">
                    <div class="header_02" style="text-align: center" ><a name="arcade" >Connect Info</a></div>

                    <div class="margin_bottom_20"></div>
                    <h1>Created By:</h1>
                    <h3>    Demchenko Ilya  </h3>
                    <h3>    Alyiev Roman  </h3>
                    <h2>Group:ITIS-1916R</h2>
                    <p>For more info write or contact us you can Here: <a href="https://mail.ru/">ilya.dem01@mail.ru</a></p>
                    <div class="cleaner"></div>
                </div>

                <div class="margin_bottom_20 horizontal_divider"></div>
                <div class="margin_bottom_20"></div>


                <div class="margin_bottom_40"></div>
            </div>
            </div>
            <!-- end of content -->

            <div class="templatemo_side_bar">

                <div class="header_01">Latest News</div>
                <div class="latest_news">
                    <div class="header_03"><a href="https://www.youtube.com/watch?v=0uav6zQKiMQ">Elden Ring review</a></div>
                    <p>Video review for new Hardcore Game from creators of Dark Souls Series FROM SOFTWARE</p>
                </div>


                <div class="margin_bottom_10"></div>

                <div class="latest_news">
                    <div class="header_03"><a href="https://www.eurogamer.net/new-witcher-game-release-date-lynx-school-the-witcher-4-9019#:~:text=A%20major%20new%20Witcher%20game,new%20saga%20for%20the%20franchise.%22">Announcement new The Witcher</a></div>
                    <p>A major new Witcher game is in development by series developer CD Projekt Red. "We're happy to announce that the next instalment in The Witcher series of video games is currently in development," said the studio in a statement in March 2022, "kicking off a new saga for the franchise."</p>
                </div>

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