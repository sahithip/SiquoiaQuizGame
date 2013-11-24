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
                <td>
            User name: ${loggedIn.userName}
            </td>
                </tr>
                <tr>
                <td>
            User ID:   ${loggedIn.userId}
            </td>
                </tr>
                <tr>
                <td>
            First name: ${loggedIn.firstName}
            </td>
                </tr>
                
                <tr>
                <td>
            Last name: ${loggedIn.lastName}
            </td>
                </tr>
                </table>
            <a href="SiquoiaFrontController?command=logout">Logout</a>
            <a href="SiquoiaFrontController?command=addQue">Add Question</a>
            <a href="SiquoiaFrontController?command=verifyQue">Verify Question</a>
        </div>
            
        <div class="bot">
            <p>SiQuoia © - 2013</p>
        </div>
        
    </body>
</html>
