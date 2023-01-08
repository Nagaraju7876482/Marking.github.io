package nothing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sussi")
public class Sussi extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

Cookie cookie = new Cookie("name", req.getParameter("name"));
Cookie cookie1 = new Cookie("favouritem", req.getParameter("favouritem"));
Cookie cookie2 = new Cookie("favouriteh", req.getParameter("favouriteh"));
Cookie cookie3 = new Cookie("favouritehe", req.getParameter("favouritehe"));
resp.addCookie(cookie);
resp.addCookie(cookie1);
resp.addCookie(cookie2);
resp.addCookie(cookie3);

resp.sendRedirect("Response.jsp");	}

}
