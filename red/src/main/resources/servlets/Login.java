package servlets;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import ex.DaoCountryPrep;

/**
 * Servlet implementation class Login
 */
@WebServlet("/resurces/Login")
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
	        String s= "select user_id, user_name, user_surname, user_birth, user_password, user_username, user_creditcard, user_licence from members where user_username= ? and user_password=?";
	        
	        request.setAttribute("users", dao.getUsers(s,request.getParameter("fav"), request.getParameter("PASSWORDPLAC")));
	        request.getRequestDispatcher("/red/Placeholder.jsp").forward(request, response);
		
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
