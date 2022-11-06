<%-- 
    Document   : newjsp3
    Created on : 19-Mar-2022, 18:52:39
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form method="post">
            <% List dt=(List) request.getAttribute("Yash1"); %>
           <center>
           <table width="600" border="2">
               <tr>
                   <th> Name </th>
                   <th> Email </th>
                   <th> Complaint </th>
                   
                          
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
           
        </form>
    </body>
</html>
