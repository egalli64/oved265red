package red;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/red")
	private DataSource ds;
       
    public Registration() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	
		
		RegistrationDao dao= new RegistrationDao(ds);
		Date c= Date.valueOf("2000-01-01");
		request.setAttribute("users", dao.setUser(request.getParameter("name"), request.getParameter("surname"),Date.valueOf(request.getParameter("franco")),request.getParameter("email"),request.getParameter("psw"),Long.parseLong(request.getParameter("creditcard")),request.getParameter("driveID") ));
		if (request.getAttribute("users").equals("e-mail already used") || request.getAttribute("users").equals("licence already used")) {
			request.getRequestDispatcher("/signupsuccErr.jsp").forward(request, response);
		} else {
		request.getRequestDispatcher("/signupsucc.jsp").forward(request, response);
		}
		} catch (ServletException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
