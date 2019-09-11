package red;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

		HttpSession session = request.getSession();

		if (request.getParameter("email") != null) {

			DaoUser dao = new DaoUser(ds);

			request.setAttribute("users", dao.getUsers(request.getParameter("email"), request.getParameter("password")));
			if (dao.getUsers(request.getParameter("email"), request.getParameter("password")).size() < 1) {
				 session.invalidate();
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
			if (dao.getUsers(request.getParameter("email"), request.getParameter("password")).size() == 1) {
				session.setAttribute("logged",dao.getUsers(request.getParameter("email"), request.getParameter("password")).get(0));
				request.getRequestDispatcher("/loginsucc.jsp").forward(request, response);
			}
		}
		if (request.getParameter("name") != null) {

			DaoSuperUser dao = new DaoSuperUser(ds);

			request.setAttribute("users",dao.getSuperUsers(request.getParameter("name"), request.getParameter("spassword")));
			if (dao.getSuperUsers(request.getParameter("name"), request.getParameter("spassword")).size() < 1) {
				 session.invalidate();
				request.getRequestDispatcher("/adminLog.jsp").forward(request, response);
			}
			if (dao.getSuperUsers(request.getParameter("name"), request.getParameter("spassword")).size() == 1) {
				session.setAttribute("logged",dao.getSuperUsers(request.getParameter("name"), request.getParameter("spassword")).get(0));
				request.getRequestDispatcher("/adminsucc.jsp").forward(request, response);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}