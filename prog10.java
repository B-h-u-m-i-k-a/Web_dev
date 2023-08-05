 import java.io.IOException;
 import java.io.PrintWriter;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/prog10"})
public class prog10 extends HttpServlet 
{
            protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
            {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) 
                {
                    double total=0,vat;
                    String username = request.getParameter("myname");
                    String prices[] = request.getParameterValues("b");
                    String bulbpaymode = request.getParameter("paymode");
                    out.println("user name is: "+username);
                    out.println("<br/>");
                    for (String bulbprice : prices) 
                    { 
                         vat=Double.parseDouble(bulbprice)*0.2;
                       total=total+Double.parseDouble(bulbprice)+vat    
                    }
            
            out.println("Bulb price after tax is: " + total);
            out.println("<br/>");
            out.println("Paymode is: " + bulbpaymode);
        }
    }
}
