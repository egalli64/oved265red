package Filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Admin.SuperUser;

@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD }, urlPatterns = { "/adminsucc.jsp", "/AdminRegistration" })
public class AdminFilter implements Filter {
	
	 private FilterConfig fc;

	    public void init(FilterConfig fc) throws ServletException {
	        this.fc = fc;
	    }

    public AdminFilter() {
    }

	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		if (request instanceof HttpServletRequest) {
			
            HttpServletRequest hsr = (HttpServletRequest) request;
            HttpSession session = hsr.getSession();
            if (session.getAttribute("logged") instanceof SuperUser) {
            	
            	chain.doFilter(request, response);
            	
            } else {
				HttpServletResponse hsr1 = (HttpServletResponse) response;
				hsr1.setContentType("text/html");
				hsr1.sendError(HttpServletResponse.SC_BAD_REQUEST, "You are not allowed to perform this action");
			}
            
		
	}
	}

}
