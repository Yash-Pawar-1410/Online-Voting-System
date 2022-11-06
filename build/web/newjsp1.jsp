<%-- 
    Document   : newjsp1
    Created on : 21-Feb-2022, 18:44:56
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complaint</title>
        <link rel="stylesheet" href="style3.css">
    </head>
    <body>
         <div class="center">
            <h1>Complaint Box</h1>
             <form method="post" action="NewServlet3">
            <form method="post">
                <div class="txt_field">
                    <input type="text" required name="t1">
                    <span></span>
                    <label>Name</label>
                </div>
                <div class="txt_field">
                    <input type="text" required name="t2">
                    <span></span>
                    <label>Email</label>
                </div>

                <div class="txt_field">
                    <input type="text" required name="t3">
                    <span></span>
                    <label>Complaint</label>
                </div>
                
                <input type="submit" value="Submit">
               
            </form>
        </div>
    </body>
</html>
