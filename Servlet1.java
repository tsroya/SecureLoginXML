
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

   // public void init() throws ServletException {
        // Do required initialization

   // }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            // TODO Auto-generated method stub

            response.setContentType("text/html");

            // Actual logic goes here.
            PrintWriter out = response.getWriter();
            //  out.println("<h1>" + message + "</h1>");

            //HttpSession session = request.getSession(false);
            //if (session != null) {
              //  String name = (String) session.getAttribute("user");
            String userid=request.getParameter("userid");
            String password=request.getParameter("password");
           // request.getRequestDispatcher("loginPage.xml").include(request, response);

            out.println("<?xml version = \"1.0\"?>");
                out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD " +
                        "XHTML 1.0 Strict//EN\" \"http:www.w3.org" +
                        "/TR/xhtml11/DTD/xhtm11-strict.dtd\">"
                );
                out.println(
                        "<html xmlns = \"http://www.w3.org/1999/xhtml\">"
                );
            if(password != ""){

                HttpSession session=request.getSession();
                session.setAttribute("userid",userid);
                //head section of document
                out.println("<head>");
                out.println("<title>Welcome to the Website Page</title>");
                out.println("</head>");
                //body section of document
                out.println("<body>");
                out.println("<h1>Welcome to the admin </h1>");
                out.println("<p>Click on any link to view content pages! </p>");

                out.println("</body>");

                out.println("<p><a href= " + "\"./Servlet2\">" + "Logout</a></p>");

                //end XHTML document
                out.println("</html>");
            }
            else{
                out.print("Sorry, username or password error!");
                //request.getRequestDispatcher("loginPage.xml").include(request, response);
            }



                //close stream to complete the page
                out.close();

            //}

        }
}