package login;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Login login=new Login();
		if (login.execute(request, response)) {
			response.sendRedirect("/SpringMVC/login/login_succ.jsp");
		} else {
			response.sendRedirect("/SpringMVC/login/login_err.jsp");
		}
	}
}
