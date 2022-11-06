<%-- 
    Document   : newjsp5
    Created on : 19-Mar-2022, 19:04:43
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>body{
    margin: 0;
    padding: 0;
    font-family: montserrat;
    background: linear-gradient(120deg,#2980b9,#8e44ad);
    height: 100vh;
    overflow: hidden;
}
div1{
   position: absolute;
    top: 40%;
    left: 37%;
    transition: translate(-50%, -50%);
    width: 400px;
    height: 60px;
    background: white;
    border-radius: 10px;
    padding-top: 15px;
}
table{
    position: absolute;
    top: 5%;
    left: 32%;
    transition: translate(-50%, -50%);
    width: 550px;
    height: 5px;
    background: white;
    
}        
 </style>
    </head>
    <body>
       <form method="post" action="NewServlet8">
            <% List dt=(List) request.getAttribute("Yash2"); %>
           <center>
           <table width="600" border="2">
              
               <tr>
               
                   <th> Voter ID </th>
                   <th> Full Name </th>
                   <th> Election Type </th>
                   <th> Party </th>
                   
               </tr> 
               <% for(Object pandu:dt){
                    String nm=(String) pandu;
                    StringTokenizer st=new StringTokenizer(nm,":");
                    %>
                    <tr>
                    <%
                        while(st.hasMoreTokens())
                   {
                    String field1=st.nextToken();    
                %>
                <td><%=field1 %></td>
                <% } %>
           </tr>
                <% } %>
           </table>
           <br>
           <br>
           <div1>
            <div class="input-box">
                    <span class="details">Enter your voter Id</span>
                    <input type="text" placeholder="Enter your voter Id" name="t1" >
                </div>
            <div class="button">
                <input type="submit" value="Vote">
            </div>
           </div1>
        </form>
    </body>
</html>
