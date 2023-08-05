import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class redirectto extends HttpServlet 
{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                                                        throws ServletException, IOException 
    {
          response.setContentType("text/html;charset=UTF-8");
          try (PrintWriter out = response.getWriter()) 
         {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet redirectto</title>");            
            out.println("</head>");
            out.println("<body>");
            String singername=request.getAttribute("sname").toString();
            String composername=request.getAttribute("cname").toString();
            String artist=request.getAttribute("art").toString();
            out.println(singername);
            out.println("<br/>");
            out.println(composername);
            out.println(artist);
            out.println("<h4>Servlet redirectto at " + request.getContextPath() + "</h4>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
