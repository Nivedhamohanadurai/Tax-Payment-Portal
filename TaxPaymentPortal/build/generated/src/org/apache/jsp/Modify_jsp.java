package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Modify</title>\n");
      out.write("        <style>\n");
      out.write("            *,\n");
      out.write("            *:before,\n");
      out.write("            *:after{\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: #080710;\n");
      out.write("            }\n");
      out.write("            .background{\n");
      out.write("                width: 430px;\n");
      out.write("                height: 520px;\n");
      out.write("                position: absolute;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("            }\n");
      out.write("            .background .shape{\n");
      out.write("                height: 200px;\n");
      out.write("                width: 200px;\n");
      out.write("                position: absolute;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .shape:first-child{\n");
      out.write("                background: linear-gradient(\n");
      out.write("                    #1845ad,\n");
      out.write("                    #23a2f6\n");
      out.write("                );\n");
      out.write("                left: -80px;\n");
      out.write("                top: -80px;\n");
      out.write("            }\n");
      out.write("            .shape:last-child{\n");
      out.write("                background: linear-gradient(\n");
      out.write("                    to right,\n");
      out.write("                    #ff512f,\n");
      out.write("                    #f09819\n");
      out.write("                );\n");
      out.write("                right: -30px;\n");
      out.write("                bottom: -200px;\n");
      out.write("            }\n");
      out.write("            .result{\n");
      out.write("                height: 620px;\n");
      out.write("                width: 400px;\n");
      out.write("                background-color: rgba(255,255,255,0.13);\n");
      out.write("                position: absolute;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                backdrop-filter: blur(10px);\n");
      out.write("                border: 2px solid rgba(255,255,255,0.1);\n");
      out.write("                box-shadow: 0 0 40px rgba(8,7,16,0.6);\n");
      out.write("                padding: 50px 35px;\n");
      out.write("            }\n");
      out.write("            .result *{\n");
      out.write("                font-family: 'Poppins',sans-serif;\n");
      out.write("                color: #ffffff;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .result h3{\n");
      out.write("                font-size: 32px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                line-height: 42px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label{\n");
      out.write("                display: block;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: 500;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                display: block;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: rgba(255,255,255,0.07);\n");
      out.write("                border-radius: 3px;\n");
      out.write("                padding: 0 10px;\n");
      out.write("                margin-top: 8px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 300;\n");
      out.write("            }\n");
      out.write("            select{\n");
      out.write("                display: block;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: rgba(255,255,255,0.07);\n");
      out.write("                border-radius: 3px;\n");
      out.write("                padding: 0 10px;\n");
      out.write("                margin-top: 8px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 300;\n");
      out.write("            }\n");
      out.write("            ::placeholder{\n");
      out.write("                color: #e5e5e5;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                margin-top: 50px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                color: #080710;\n");
      out.write("                padding: 15px 0;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .left{\n");
      out.write("                margin-top: 150px;\n");
      out.write("                width: 20%;\n");
      out.write("                background-color: #080710;;\n");
      out.write("                color: #080710;\n");
      out.write("                padding: 15px 0;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                float: left;\n");
      out.write("                margin-left: 50px;\n");
      out.write("            }\n");
      out.write("            .right{\n");
      out.write("                margin-top: 50px;\n");
      out.write("                width: 10%;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                color: #080710;\n");
      out.write("                padding: 15px 0;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                float: right;\n");
      out.write("                margin-right: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"background\">\n");
      out.write("            <div class=\"shape\"></div>\n");
      out.write("            <div class=\"shape\"></div>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"Login.html\">\n");
      out.write("            <button class=\"right\" style=\"color: #080710;\">Logout</button>\n");
      out.write("        </a>\n");
      out.write("        <div class=\"result\">\n");
      out.write("            <h3 align=\"center\">Modify Citizens tax amount</h3>\n");
      out.write("            <br/><br/>\n");
      out.write("            <form style=\"text-align: center\">\n");
      out.write("                <h4>Enter username of citizen: <input type=\"text\" name=\"userr\"/></h4>\n");
      out.write("                <br/><br/>\n");
      out.write("                <h4> Select the Tax type to be modified: \n");
      out.write("                    <select name=\"item\">\n");
      out.write("                        <option value=\"1\">Property tax</option>\n");
      out.write("                        <option value=\"2\">Income tax</option>\n");
      out.write("                        <option value=\"3\">Drainage tax</option>\n");
      out.write("                        <option value=\"4\">Water tax</option>\n");
      out.write("                    </select>\n");
      out.write("                </h4>\n");
      out.write("                <br/><br/>\n");
      out.write("                <h4 align=\"center\">Enter the amount to be added: <input type=\"text\" name=\"am\"/></h4>\n");
      out.write("                <br/>\n");
      out.write("                <button style=\"color: #080710;\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("            <br/><br/>\n");
      out.write("            ");

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
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <a href=\"Government.jsp\">\n");
      out.write("                <button style=\"color: #080710;\">View pending amount</button>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
