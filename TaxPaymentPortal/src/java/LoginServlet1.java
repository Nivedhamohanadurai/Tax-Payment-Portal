import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/swe2013_java";
        final String USER="root";
        final String PASS="root";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("DB connected....");
            PrintWriter out = response.getWriter();
            Statement stmt=conn.createStatement();
            String s1=request.getParameter("user");
            String s2=request.getParameter("pass");
            ResultSet rs = stmt.executeQuery("select * from tax_citizens where username='"+s1+"' and password='"+s2+"'");
            if(rs.next()){
                RequestDispatcher req = request.getRequestDispatcher("Citizens.jsp");
                req.include(request, response);
            }
            else{
                rs = stmt.executeQuery("select * from tax_government where username='"+s1+"' and password='"+s2+"'");
                if(rs.next()){
                    response.sendRedirect("Government.jsp");
                } else {
                    response.sendRedirect("LoginFail.jsp");
                }
            }
        }catch(SQLException | ClassNotFoundException ex ){
            Logger.getLogger(LoginServlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
