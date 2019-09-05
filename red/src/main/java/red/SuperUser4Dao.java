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

@WebServlet("/adminLog")
public class SuperUser4Dao extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Resource(name = "jdbc/red")
    private DataSource ds2;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	DaoSuperUser dao = new DaoSuperUser(ds2);
    	
    	String username = request.getParameter("name");
    	String password = request.getParameter("password");
    	
    	if (dao.check(username, password)) {
    	SuperUser superUser = new SuperUser();
    	
    	superUser.setSuperUsername(username);
    	superUser.setSuperPassword(password);
    	
    	HttpSession session = request.getSession(true);
    	
    	session.setAttribute("superUsers", superUser);
		request.setAttribute("superUsers", superUser);
		request.getRequestDispatcher("loginsucc.jsp").forward(request, response);
    	
    	} else {
    		response.sendRedirect("loginsucc.jsp");
    	}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}