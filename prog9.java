import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/prog9"})
public class prog999 extends HttpServlet
 {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
 	throws ServletException, IOException 
{
 	      response.setContentType("text/html;charset=UTF-8");
 	      try (PrintWriter out = response.getWriter()) 
          {
   
             String [] arr = {"hello", "how r u", "what r u doing ", "welcome","good morning"};
             Random random = new Random();
             int select = random.nextInt(arr.length); 
            out.println("Random String selected: " + arr[select]); 
          }
    }
