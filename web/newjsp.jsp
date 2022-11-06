<%-- 
    Document   : newjsp
    Created on : 16-Feb-2022, 07:15:20
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8">
    <title>Registration Form</title>
    <link rel="stylesheet" href="style1.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class=" container">
        <div class="title">Registration for Voters</div>
       <form method="post" action="NewServlet2">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">Full Name</span>
                    <input type="text" placeholder="Enter your name" required name="t1" >
                </div>
                <div class="input-box">
                    <span class="details">Voter Id</span>
                    <input type="text" placeholder="Enter your voter Id" required name="t2">
                </div>
                 <div class="input-box">
                    <span class="details">Birth Date</span>
                    <input type="date" placeholder="Enter your age" required name="t3">
                </div>
                <div class="input-box">
                    <span class="details">Type</span>
                    <select name="t4" style="height: 44px; width: 300px; border-radius: 10px;  border-color: #e9b9fc; border-bottom-width:3px ;
                      transition: all .3s ease; " >
                        <option >Select</option>
                        <option>Indian</option>
                        <option>Overseas</option>
                    </select>
                </div>
           
            <div class="input-box">
                <span class="details">Address</span>
                <input type="address" placeholder="Enter your address" required name="t5">
            </div>
                <div class="input-box">
                    <span class="details">Phone No.</span>
                    <input type="text" placeholder="Enter your phone no." required name="t6">
                </div>
                

                <div class="input-box">
                    <span class="details">Email</span>
                    <input type="text" placeholder="Enter your email" required name="t7">
                </div>
                <div class="input-box">
                    <span class="details">Username</span>
                    <input type="text" placeholder="Enter your username" required name="t8">
                </div>
                
                <div class="input-box">
                    <span class="details">Password</span>
                    <input type="password" placeholder="Enter your password" required name="t9">
                </div>
                <div class="input-box">
                    <span class="details">Confirm Password</span>
                    <input type="password" placeholder="Confirm your password" name="t11">
                </div>
            </div>
            <div class="gender-details">
                <input type="radio"  id="dot-1" name="t10" value="Male">
                <input type="radio"  id="dot-2" name="t10" value="Female">
                <input type="radio"  id="dot-3" name="t10" value="Others">
                <span class="gender-title">Gender</span>
                <div class="category">
                    <label for="dot-1">
                        <span class="dot one"></span>
                        <span class="gender">Male</span>
                    </label>
                    <label for="dot-2">
                        <span class="dot two"></span>
                        <span class="gender">Female</span>
                    </label>
                    <label for="dot-3">
                        <span class="dot three"></span>
                        <span class="gender">Other</span>
                    </label>
                </div>
            </div>
            
            <div class="button">
                <input type="submit" value="Register">
            </div>
        </form>
    </div>
    </body>
</html>
