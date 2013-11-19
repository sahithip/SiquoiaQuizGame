<%-- 
    Document   : index
    Created on : 20-09-2013, 11:31:40
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - SiQuoia</title>
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
        <link rel="stylesheet" href="style.css"/>
        <script>
        try {  
            $(document).ready(function() {
//                $("form").submit(function(){
//                    alert("logging in");
//                });
            });
        } catch (error) {
          console.error("Your javascript has an error: " + error);
        }
        </script>
    </head>
    <body>
        <div class="top">
            <div class="logos">
                <h1>SiQuoia</h1>
            </div>
        </div>
        <div class="content">
            <div id="formbody">
                <h1>
                    Log in/Sign up
                </h1>
                <div id="formcontent">
                    <form action="SiquoiaFrontController" method="post">
                        <table>
                            <tr>
                                <td>
                                Username:<input name="userName" placeholder="username" type="text"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                Password:<input name="password" placeholder="password" type="password"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <button type="submit" name="command" value="login">Log in</button>
                                <td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
        
        <div class="bot">
            <p>SiQuoia © - 2013</p>
        </div>
    </body>
</html>
