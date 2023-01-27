<%-- 
    Document   : Modify
    Created on : 22 Feb, 2022, 11:47:31 PM
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
        <title>Modify</title>
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
                bottom: -100px;
            }
            .result{
                height: 620px;
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
            select{
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
            .left{
                margin-top: 150px;
                width: 20%;
                background-color: #080710;;
                color: #080710;
                padding: 15px 0;
                font-size: 18px;
                font-weight: 600;
                border-radius: 5px;
                cursor: pointer;
                float: left;
                margin-left: 50px;
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
            <h3 align="center">Modify Citizens tax amount</h3>
            <br/><br/>
            <form style="text-align: center">
                <h4>Enter username of citizen: <input type="text" name="userr"/></h4>
                <br/><br/>
                <h4> Select the Tax type to be modified: 
                    <select name="item">
                        <option value="1" style="color: #080710;">Property tax</option>
                        <option value="2" style="color: #080710;">Income tax</option>
                        <option value="3" style="color: #080710;">Drainage tax</option>
                        <option value="4" style="color: #080710;">Water tax</option>
                    </select>
                </h4>
                <br/><br/>
                <h4 align="center">Enter the amount to be added: <input type="text" name="am"/></h4>
                <br/>
                <button style="color: #080710;">Submit</button>
            </form>
            <br/><br/>
            <%
                try{
                    String user=request.getParameter("userr");
                    if(user.equals("")){
                        out.println("<h2 align=\"center\">Please enter the username!");
                    } 
                    else {
                        String value=request.getParameter("item");
                        String f=request.getParameter("am");
                        if(f.equals("")){
                            out.println("<h2 align=\"center\">Please enter the amount to be added!");
                        }
                        else {
                            float am=0;
                            am=Float.parseFloat(f);
                            Connection con;
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swe2013_java","root","root");
                            Statement stmt=con.createStatement();
                            ResultSet rs=stmt.executeQuery("select * from tax_amount where username='"+user+"'");
                            if(rs.next()){
                                out.println("<h2 align=\"center\">Username: "+rs.getString("username")+"</h2>");
                                if(value.equals("1")){
                                    out.println("<h3 align=\"center\">Property tax Pending: "+rs.getFloat("property_tax")+"</h3>");
                                    out.println("<h3 align=\"center\">Amount to be added: "+am+"</h3>");
                                    float uam=rs.getFloat("property_tax")+am;
                                    stmt.executeUpdate("UPDATE tax_amount SET property_tax= "+uam+" WHERE username='"+rs.getString("username")+"'");
                                    out.println("<h3 align=\"center\">Updated property tax: "+uam+"</h3>");
                                }else if(value.equals("2")){
                                    out.println("<h3 align=\"center\">Income tax Pending: "+rs.getFloat("income_tax")+"</h3>");
                                    out.println("<h3 align=\"center\">Amount to be added: "+am+"</h3>");
                                    float uam=rs.getFloat("income_tax")+am;
                                    stmt.executeUpdate("UPDATE tax_amount SET income_tax= "+uam+" WHERE username='"+rs.getString("username")+"'");
                                    out.println("<h3 align=\"center\">Updated income tax: "+uam+"</h3>");
                                }else if(value.equals("3")){
                                    out.println("<h3 align=\"center\">Drainage tax Pending: "+rs.getFloat("drainage_tax")+"</h3>");
                                    out.println("<h3 align=\"center\">Amount to be added: "+am+"</h3>");
                                    float uam=rs.getFloat("drainage_tax")+am;
                                    stmt.executeUpdate("UPDATE tax_amount SET drainage_tax= "+uam+" WHERE username='"+rs.getString("username")+"'");
                                    out.println("<h3 align=\"center\">Updated drainage tax: "+uam+"</h3>");
                                }else if(value.equals("4")){
                                    out.println("<h3 align=\"center\">Water tax Pending: "+rs.getFloat("water_tax")+"</h3>");
                                    out.println("<h3 align=\"center\">Amount to be added: "+am+"</h3>");
                                    float uam=rs.getFloat("water_tax")+am;
                                    stmt.executeUpdate("UPDATE tax_amount SET water_tax= "+uam+" WHERE username='"+rs.getString("username")+"'");
                                    out.println("<h3 align=\"center\">Updated water tax: "+uam+"</h3>");
                                }
                            } else {
                                out.println("<h2 align=\"center\">Enter a Valid Username!</h2>");
                            }
                        }
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            %>
        </div>
        <div class="left">
            <a href="Government.jsp">
                <button style="color: #080710;">View pending amount</button>
            </a>
        </div>
    </body>
</html>
