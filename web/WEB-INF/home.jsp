<%-- 
    Document   : home
    Created on : Oct 12, 2020, 9:58:57 PM
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
        <h1>Welcome ${sessionScope.user}</h1>
        <a href ="./login?logout">Logout</a>
    </body>
</html>
