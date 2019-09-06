package red;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/red")
	private DataSource ds;

	public Login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getParameter("email") != null) {

		DaoUser dao = new DaoUser(ds);

		request.setAttribute("users", dao.getUsers(request.getParameter("email"), request.getParameter("password")));
		request.getRequestDispatcher("/loginsucc.jsp").forward(request, response);
		}
		if (request.getParameter("name") != null) {
			
			DaoSuperUser dao = new DaoSuperUser (ds);

			request.setAttribute("users", dao.getSuperUsers(request.getParameter("name"), request.getParameter("spassword")));
			request.getRequestDispatcher("/loginsuccX.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}