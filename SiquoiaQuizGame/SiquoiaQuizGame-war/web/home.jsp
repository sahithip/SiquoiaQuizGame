<%-- 
    Document   : home
    Created on : 15-10-2013, 22:26:39
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home - SiQuoia</title>
    </head>
    <body>
        <h1>LOGGED IN AND ON HOMEPAGE</h1>
        User name: ${loggedIn.userName}
        User ID:   ${loggedIn.userId}
        <a href="SiquoiaFrontController?command=logout">Logout</a>
    </body>
</html>
