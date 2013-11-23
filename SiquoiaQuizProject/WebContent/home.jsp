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
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div class="top">
            <div class="logos">
                <h1>SiQuoia</h1>
            </div>
        </div>
        <div class="content">
            <h2>Welcome</h2>
            <table>
                <tr>
            User name: ${loggedIn.userName}
                </tr>
                <tr>
            User ID:   ${loggedIn.userId}
                </tr>
                <tr>
            First name: ${loggedIn.firstName}
                </tr>
                <tr>
            Last name: ${loggedIn.lastName}
                </tr>
            </table>
            <a href="SiquoiaFrontController?command=logout">Logout</a>
            </table>
        </div>
            <div id="test"><p>TEST
                </p></div>
                $("#test p").delay(1000).animate({"opacity": "1"}, 700);
        <div class="bot">
            <p>SiQuoia © - 2013</p>
        </div>
        
    </body>
</html>
