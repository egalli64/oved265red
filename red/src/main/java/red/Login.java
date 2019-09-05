package red;


import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


/**
 * Servlet implementation class Login
 */
@WebServlet("/resources/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 @Resource(name = "jdbc/red")
	    private DataSource ds;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 DaoUser dao = new DaoUser(ds);
	        String s= "select users_id, users_name, users_surname, users_birth, users_password, users_username, users_creditcard, users_licence from users where users_username= ? and users_password=?";
	        
	        request.setAttribute("users", dao.getUsers(s,request.getParameter("email"), request.getParameter("password")));
	        request.getRequestDispatcher("/loginsucc.jsp").forward(request, response);
		
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
