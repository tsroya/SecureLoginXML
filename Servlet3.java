

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.invalidate();
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
	       out.println( "<title>Welcome to the Website Page</title>" );
	       out.println( "</head>" );
	       //body section of document
	       out.println( "<body>" );
	       out.println( "<h1>You are successfully logged out.</h1>" );
	       out.println( "<p><a href= " + "\"index.html\">" + "Index Page</a></p>");
	     //  out.print("<p><a href='index.html'>Index Page</a></P>");
	       out.println( "</body>" );
	       
	       //out.println( "<p><a href= " + "\"./Servlet3\">" + "Logout</a></p>");
			
		   //end XHTML document
		   out.println( "</html>" );
		   //close stream to complete the page
		   out.close();
	      
		//out.print("You are successfully logged out.");
		out.print("<a href='index.html'>Index Page</a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
