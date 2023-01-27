<%-- 
    Document   : Citizens
    Created on : 22 Feb, 2022, 11:02:15 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.logging.Level"%>
<%@ page import="java.util.logging.Logger"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Citizen Page</title>
        <style>
            *,
            *:before,
            *:after{
                padding: 0;
                margin: 0;
                box-sizing: border-box;
            }
            body{
                background-color: #080710;
            }
            .background{
                width: 430px;
                height: 520px;
                position: absolute;
                transform: translate(-50%,-50%);
                left: 50%;
                top: 50%;
            }
            .background .shape{
                height: 200px;
                width: 200px;
                position: absolute;
                border-radius: 50%;
            }
            .shape:first-child{
                background: linear-gradient(
                    #1845ad,
                    #23a2f6
                );
                left: -80px;
                top: -80px;
            }
            .shape:last-child{
                background: linear-gradient(
                    to right,
                    #ff512f,
                    #f09819
                );
                right: -30px;
                bottom: -80px;
            }
            .result{
                height: 520px;
                width: 400px;
                background-color: rgba(255,255,255,0.13);
                position: absolute;
                transform: translate(-50%,-50%);
                top: 50%;
                left: 50%;
                border-radius: 10px;
                backdrop-filter: blur(10px);
                border: 2px solid rgba(255,255,255,0.1);
                box-shadow: 0 0 40px rgba(8,7,16,0.6);
                padding: 50px 35px;
            }
            .result *{
                font-family: 'Poppins',sans-serif;
                color: #ffffff;
                letter-spacing: 0.5px;
                outline: none;
                border: none;
            }
            .result h3{
                font-size: 32px;
                font-weight: 500;
                line-height: 42px;
                text-align: center;
            }

            label{
                display: block;
                margin-top: 30px;
                font-size: 16px;
                font-weight: 500;
            }
            input{
                display: block;
                height: 50px;
                width: 100%;
                background-color: rgba(255,255,255,0.07);
                border-radius: 3px;
                padding: 0 10px;
                margin-top: 8px;
                font-size: 14px;
                font-weight: 300;
            }
            ::placeholder{
                color: #e5e5e5;
            }
            button{
                margin-top: 50px;
                width: 100%;
                background-color: #ffffff;
                color: #080710;
                padding: 15px 0;
                font-size: 18px;
                font-weight: 600;
                border-radius: 5px;
                cursor: pointer;
            }
            .right{
                margin-top: 50px;
                width: 10%;
                background-color: #ffffff;
                color: #080710;
                padding: 15px 0;
                font-size: 18px;
                font-weight: 600;
                border-radius: 5px;
                cursor: pointer;
                float: right;
                margin-right: 20px;
            }
        </style>
    </head>
    <body>
        <div class="background">
            <div class="shape"></div>
            <div class="shape"></div>
        </div>
        <a href="Login.html">
            <button class="right" style="color: #080710;">Logout</button>
        </a>
        <div class="result">
            <h3 align='center'>Welcome!!!</h3><br/><br/>
            <%
                String user=request.getParameter("user");
                try{
                    Connection con;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swe2013_java","root","root");
                    Statement stmt=con.createStatement();
                    System.out.println("DB connected");
                    ResultSet rs=stmt.executeQuery("select * from tax_amount where username='"+user+"'");
                    if(rs.next()){
                        out.println("<h4 align=\"center\">Username: "+rs.getString("username")+"</h4><br/>"+
                                    "<h4 align=\"center\">Property Tax pending: "+rs.getFloat("property_tax")+"</h4><br/>"+
                                    "<h4 align=\"center\">Income Tax pending: "+rs.getFloat("income_tax")+"</h4><br/>"+
                                    "<h4 align=\"center\">Drainage Tax pending: "+rs.getFloat("drainage_tax")+"</h4><br/>"+
                                    "<h4 align=\"center\">Water Tax pending: "+rs.getFloat("water_tax")+"</h4><br/>");
                    }
                    else{
                        out.println("<h4 align=\"center\">Username: "+user+" does not exists!!</h4>");
                    }
                }catch(Exception ex){
                    System.out.println(ex);
                }
            %>
            <br/><br/>
            <a href="Payment.jsp">
                <button style="color: #080710;">Proceed to Pay</button>
            </a>
        </div>
    </body>
</html>
