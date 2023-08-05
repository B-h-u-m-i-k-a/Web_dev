import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class prog12 extends HttpServlet
 {
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                                                        throws ServletException, IOException 
     {
           response.setContentType("text/html;charset=UTF-8");
           try (PrintWriter out = response.getWriter()) 
          {
                String singername = request.getParameter("sname");
                out.println("singer name is: "+singername);
                String composername = request.getParameter("cname");
               out.println("composername is: " + composername);
               String artists[] = request.getParameterValues("artist");
                if (artists != null) 
               {
                  out.println("artists are: ");
                 for (String artistnames : artists) 
                {
                    out.println("\t" + artistnames);
                    request.setAttribute("art", artistnames);
                 }
              }
              request.setAttribute("sname", singername);
              request.setAttribute("cname", composername);
              ServletContext context= getServletContext();
             RequestDispatcher rd= context.getRequestDispatcher("/redirectto");
              rd.forward(request, response);
        }
    }
}
