<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Program 11</title>
    </head>
    <body> 
     <%
        double total=0,vat;
        String username=request.getParameter("myname");
         String prices[] = request.getParameterValues("b");
        String bulbpaymode = request.getParameter("paymode");
        out.println("User name is: " +username);
        out.println("<br/>");
        for (String bulbprice : prices) 
        {
           vat=Double.parseDouble(bulbprice)*0.2;
            total=total+Double.parseDouble(bulbprice)+vat;
        }
        out.println("Total cost after vat is: " + total);
        out.println("<br/>");
        out.println("paymode is: " + bulbpaymode);
      %>    </body>
</html>
