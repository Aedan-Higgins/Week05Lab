<%-- 
    Document   : login
    Created on : Oct 12, 2020, 10:10:01 PM
    Author     : 789648
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 05 Lab</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <form method="post" action="login">
            Username: <input type="text" name="uname"><br>
            Password: <input type="text" name="pword"><br>
            <input type="submit" value="Login">
        </form>
        <p>${error}</p>
    </body>
</html>
