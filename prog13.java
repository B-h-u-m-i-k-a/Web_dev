import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class lab13 extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            try 
              {
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
                 Statement st=conn.createStatement();
                 String q="insert into stud values('"+user+"','"+pass+"')";
                 st.executeUpdate(q);
              
                Statement s=conn.createStatement();
                ResultSet r = s.executeQuery("select * from stud");
                out.println("<table border=1");
                out.println("<tr> <th>USER NAME</th> <th>Password</th> </tr>");
                while(r.next())
                 {
                     String name=r.getString("username");
                     String password=r.getString("password");
                     out.println("<tr><td>" + name + "</td><td>" + password +"</td></tr>"); 
                  }
                 conn.close();
              }
           catch (ClassNotFoundException | SQLException e) 
          {
            e.printStackTrace();
          }
       }
    } 
}
