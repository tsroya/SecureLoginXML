import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet extends HttpServlet{
   //process get requests from clients
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println( "<?xml version = \"1.0\"?>" );
       out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD " +
               "XHTML 1.0 Strict//EN\" \"http:www.w3.org" +
               "/TR/xhtml11/DTD/xhtm11-strict.dtd\">"
               );
       out.println(
               "<html xmlns = \"http://www.w3.org/1999/xhtml\">"
       );

       //head section of document
       out.println( "<head>" );
       out.println( "<title>Website Page</title>" );
       out.println( "</head>" );

       //body section of document
       out.println( "<body>" );
       out.println( "<h1>Welcome to the website</h1>" );
       out.println( "</body>" );

       //end XHTML document
       out.println( "</html>" );
       //close stream to complete the page
       out.close();
   }
}