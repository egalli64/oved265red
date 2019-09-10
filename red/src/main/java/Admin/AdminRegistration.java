package Admin;

import java.io.IOException;
import java.sql.Date;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/AdminRegistration")
public class AdminRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/red")
	private DataSource ds;
       
    public AdminRegistration() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	
		
		AdminRegistrationDao dao= new AdminRegistrationDao(ds);
		request.setAttribute("newadmin", dao.setAdmin(request.getParameter("name"), request.getParameter("surname"),Date.valueOf(request.getParameter("birth")),request.getParameter("email"),request.getParameter("psw") ));
		if (request.getAttribute("newadmin").equals("e-mail already used") || request.getAttribute("newadmin").equals("licence already used")) {
			request.getRequestDispatcher("/adminsucc.jsp").forward(request, response);
		} else {
		request.getRequestDispatcher("/Adminsignupsucc.jsp").forward(request, response);
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
