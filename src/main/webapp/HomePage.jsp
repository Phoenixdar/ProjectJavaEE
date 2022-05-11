<!DOCTYPE html >
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Home Page</title>
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
                <li><a href="HomePage.jsp" class="current">Home</a></li>
                <li><a href="games_list.jsp">Games</a></li>
                <li><a href="Users_Games.jsp">User Game List</a></li>
                <li><a href="User_Page.jsp">User Page</a></li>
                <li><a href="Connect_Us.jsp">Contact</a></li>
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
                    <div class="header_02" ><a name="arcade">Arcade Game</a></div>
                    <div class="image_wrapper_01"><img src="img/Arcade.jpg" alt="image"  style="width: 150px"/></div>
                    <p>Arcade (English arcade game, arcade genre) is a genre of computer games characterized by a short but intense gameplay .
                        In a narrow sense, arcade games are games for arcade slot machines. Games ported from arcade machines are also called arcade games.
                        The period from the late 1970s to the mid-1980s was characterized by the heyday of arcade games and is often referred to as the golden age of arcade games.
                        The name "arcade" comes from the English. arcade - arcade, covered gallery of shops, where arcade slot machines were traditionally located .</p>
                    <div class="margin_bottom_20"></div>
                    <div class="rc_btn_01 fl"><a href="https://en.wikipedia.org/wiki/Arcade_game">Read More</a></div>

                    <div class="cleaner"></div>
                </div>

                <div class="margin_bottom_20 horizontal_divider"></div>
                <div class="margin_bottom_20"></div>

                <div class="content_section">
                    <div class="header_02" name="action"><a name="action">Action Game</a></div>
                    <div class="image_wrapper_01"><img src="img/COD.jpg" alt="image" style="width: 150px" /></div>
                    <p> Action (action translated from English - “action”) or action movie (by analogy with the movie genre) is a genre of computer games in which the emphasis is on the physical performance of the player, including cases of eyes and hand speed and reaction. The genre is represented in a variety of observations from fighting games, shooters, and platforms that are most important to the genre, to MOBAs and some of the risks in the time environment that arguably belong to the action genre.</p>
                    <div class="margin_bottom_20"></div>
                    <div class="rc_btn_01 fl"><a href="https://ru.wikipedia.org/wiki/Action">Read More</a></div>

                    <div class="cleaner"></div>
                </div>

                <div class="margin_bottom_20 horizontal_divider"></div>
                <div class="margin_bottom_20"></div>

                <div class="content_section">
                    <div class="header_02 " name="rpg"><a name="rpg">Role Play Game</a></div>
                    <div class="image_wrapper_01"><img src="img/Adventure.jpg" alt="image" style="width: 150px" /></div>
                    <p> A role-playing video game (commonly referred to as simply a role-playing game or RPG, as well as a computer role-playing game or CRPG) is a video game genre where the player controls the actions of a character (or several party members) immersed in some well-defined world, usually involving some form of character development by way of recording statistics. Many role-playing video games have origins in tabletop role-playing games[1] and use much of the same terminology, settings and game mechanics. Other major similarities with pen-and-paper games include developed story-telling and narrative elements, player character development, complexity, as well as replay value and immersion. The electronic medium removes the necessity for a gamemaster and increases combat resolution speed. RPGs have evolved from simple text-based console-window games into visually rich 3D experiences.</p>
                    <div class="margin_bottom_20"></div>
                    <div class="rc_btn_01 fl"><a href="https://en.wikipedia.org/wiki/Role-playing_video_game">Read More</a></div>

                    <div class="cleaner"></div>
                </div>

                <div class="margin_bottom_20 horizontal_divider"></div>
                <div class="margin_bottom_20"></div>

                <div class="content_section">
                    <div class="header_02" name="fight"><a name="fight">Fighting Game</a></div>
                    <div class="image_wrapper_01"><img src="img/MKX.jpg" alt="image" style="width: 150px" /></div>
                    <p>A fighting game (also known as versus fighting game) is a video game genre that involves combat between two (or more) players. Fighting game combat features mechanics such as blocking, grappling, counter-attacking, and chaining attacks together into "combos". Characters generally engage in battle using hand to hand combat—often some form of martial arts. The fighting game genre is related to, but distinct from, the beat 'em up genre, which pits large numbers of computer-controlled enemies against one or more player characters.</p>
                    <div class="margin_bottom_20"></div>
                    <div class="rc_btn_01 fl"><a href="https://en.wikipedia.org/wiki/Fighting_game">Read More</a></div>
                    <div class="cleaner"></div>
                </div>

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