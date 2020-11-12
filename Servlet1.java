import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//request.getRequestDispatcher("LoginPage.xml").include(request, response);
		//store userid and password from Login.html
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		System.out.println("----------> " + userid);
		
		HttpSession session = request.getSession();
		boolean flag = false;
		//write the jdbc code for connecting with sql
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdemo","root","Rsd19961121a");
			
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from t");
			
			while(rs.next()) {
				
				if(userid.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					System.out.println("---------->");
					session.setAttribute("user", userid);
					flag=true;
					
					response.sendRedirect("./Servlet2");
				}
			}
			if(flag == false) {
				out.print("invalid userid or password");
			}
		}catch(Exception p) {
			out.print(p);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
