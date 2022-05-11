<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>CodePen - Animated Form</title>
    <head>
        <style>
            <%@include file='resources/style.css' %>
        </style>
        <style type="text/css">
        body{
            background-image: url('img/bg.jpg');
        }

        </style>
        <meta charset="UTF-8">
        <title>AnimaForm</title>

    </head>

</head>
<body>
<div id="templatemo_wrapper_outer">
<section class="forms-section">
    <h1 class="section-title">Login Page</h1>
    <div class="forms">
        <div class="form-wrapper is-active">
            <button type="button" class="switcher switcher-login">
                Login
                <span class="underline"></span>
            </button>

            <form class="form form-login" action="loginAction.action">
                <fieldset>
                    <legend>Please, enter your email and password for login.</legend>
                    <div class="input-block">
                        <label for="login-email">Login</label>
                        <input id="login-email" type="text" name="Username" required>
                    </div>

                    <div class="input-block">
                        <label for="login-password">Password</label>
                        <input id="login-password" type="password" required>
                    </div>

                </fieldset>
                <button type="submit" class="btn-login" value="Login">Login</button>
            </form>


        </div>
        <div class="form-wrapper">
            <button type="button" class="switcher switcher-signup" >
                Sign Up
                <span class="underline"></span>
            </button>
            <%
                String nameTitle = request.getParameter("name");
                String phoneTitle = request.getParameter("phone");
                String emailTitle = request.getParameter("email");
                if (nameTitle == null){nameTitle = "";}
                if (phoneTitle ==null){phoneTitle = "";}
                if (emailTitle ==null){emailTitle = "";}
            %>
            <form class="form form-signup" action="addUser.action" method="post">
                <fieldset>
                    <legend>Please, enter your email, name and phone confirmation for sign up.</legend>
                    <div class="input-block">
                        <label  >Name</label>
                        <input  type="text" name="name" value="<%=nameTitle%>" id="name" >
                    </div>
                    <div class="input-block">
                        <label >E-mail</label>
                        <input  name="email" id="email" type="email" value="<%=emailTitle%>" >
                    </div>
                    <div class="input-block">
                        <label >Phone</label>
                        <input  type="text" name="phone" value="<%=phoneTitle%>" id="phone">
                    </div>
                </fieldset>
                <button type="submit" class="btn-signup" value="Add User" >Continue</button>
            </form>
        </div>
    </div>
</section>
<!-- partial -->
<script type="text/javascript">
    <%@include file="resources/script.js"%>
</script>
</div>
</body>
</html>