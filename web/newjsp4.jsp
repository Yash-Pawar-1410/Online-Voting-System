<%-- 
    Document   : newjsp4
    Created on : 19-Mar-2022, 19:04:30
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" %>
<%@ page language="java" import="javax.servlet.http.*" %>

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
h1{
    text-align: center;
    padding: 5px 0 5px 5px;
    border-bottom: 1px solid silver;
    background: white;
    border-radius: 15px;
    width: 410px;
    
   
}
div{
   position: absolute;
    top: 25%;
    left: 37%;
    transition: translate(-50%, -50%);
    width: 400px;
    height: 230px;
    background: white;
    border-radius: 10px;
}
        </style>
    </head>
    <body>
    <center><h1> Starts Your Voting </h1></center>
    <%
     HttpSession sess=request.getSession();
         
    %>
            <% String dt=(String) sess.getAttribute("memberid"); %>
            <br>
            <br>
            <div >
            <center> <h2> Welcome Voter </h2>
            <br>
            <h3> Your ID & Name : <br> <%=dt %> </h3>
            <br>
        <form method="post" action="NewServlet5">
            <input type="submit" value="Voting Starts">
            </center>
            </div>
        </form>
    </body>
</html>
