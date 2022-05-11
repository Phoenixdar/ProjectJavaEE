
<%@ page import="com.dvd.model.GameLibrary" %>
<%@ page import="com.dvd.model.DVDItem" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>

    <style>
        div{
            background: antiquewhite;
            height: 200px;
            width: 500px;
        }
    </style>
    <title>Title</title>

</head>
<body>
    <%
        GameLibrary dvdLibrary = (GameLibrary) session.getAttribute("library");
        List<DVDItem> dvdItems = dvdLibrary.getDVDCollection();

        String showTitle = (String) session.getAttribute("showTitle");
        String showYear = (String) session.getAttribute("showYear");
        String showGenre = (String) session.getAttribute("showGenre");
        String showSemigenre = (String) session.getAttribute("showSemigenre");
        String showRating = (String) session.getAttribute("showRating");
    %>
    <h1> DVD list </h1>


        <%for(DVDItem dvdItem:dvdItems) { %>
        <div >
            <% if(showTitle != null && showTitle.equals("true")) {%>
            <p><%=dvdItem.getTitle()%></p>
            <%}%>

            <% if(showYear != null && showYear.equals("true")) {%>
            <p><%=dvdItem.getYear()%></p>
            <%}%>

            <% if(showGenre != null && showGenre.equals("true")) {%>
            <p><%=dvdItem.getGenre()%></p>
            <%}%>
            <% if(showSemigenre != null && showSemigenre.equals("true")) {%>
            <p><%=dvdItem.getSemi_genre()%></p>
            <%}%>

            <% if(showRating != null && showRating.equals("true")) {%>
            <p><%=dvdItem.getRating()%></p>
            <%}%>
        </div>




        <%}%>



</body>
</html>
