package red;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/adminLog")
public class SuperUser4Dao extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Resource(name = "jdbc/red")
    private DataSource ds2;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String user = request.getParameter("username");
        DaoSuperUser dao = new DaoSuperUser(ds2);
        request.setAttribute("superUsers", dao.getSuperUser(user));
        request.getRequestDispatcher("/adminLog.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}