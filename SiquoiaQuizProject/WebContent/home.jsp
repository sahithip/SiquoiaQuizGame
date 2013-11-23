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
            <ul>
        <li><a href="home.asp">Home</a></li>
        <li><a href="index.asp">Play a Quiz</a></li>
        <li><a href="submit.asp">Submit a Question</a></li>
        <li><a href="market.asp">Marketplace</a></li>
        </ul>
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
                
        <div class="bot">
            <p>SiQuoia © - 2013</p>
        </div>
        
    </body>
</html>
