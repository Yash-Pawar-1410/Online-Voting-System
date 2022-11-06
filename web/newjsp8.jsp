<%-- 
    Document   : newjsp8
    Created on : 12-Jun-2022, 10:33:48
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style>
            body{
    margin: 0;
    padding: 0;
    font-family: montserrat;
    background: linear-gradient(120deg,#2980b9,#8e44ad);
    height: 100vh;
    overflow: hidden;
}
center{
    position: absolute;
    top: 2%;
    left: 38%;
    transition: translate(-50%, -50%);
    width: 300px;
    height: 80px;
    background: white;
    border-radius: 10px;
}
div{
    position: absolute;
    top:15%;
    left: 45%;
}
         </style>
    </head>
    <body>
    <center><h1>Result of Election</h1></center>
    <form method="post" action="NewServlet9">
        <div> <input type="submit" value="Show Result"></div>
        
    </form>
    </body>
</html>
