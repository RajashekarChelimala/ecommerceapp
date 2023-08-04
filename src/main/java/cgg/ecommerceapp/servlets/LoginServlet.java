package cgg.ecommerceapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import cgg.ecommerceapp.dao.UserDao;
import cgg.ecommerceapp.entities.Users;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userEmail = request.getParameter("useremail");
		String userPassword = request.getParameter("userpassword");

		Users user = UserDao.getUser(userEmail, userPassword);

		if (user==null) {
			HttpSession session = request.getSession();
			session.setAttribute("message", "Please enter valid credentials");
			response.sendRedirect("login.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("current_user", "Youre logged in");
			if(user.getUserType().equals("admin")) {
				session.setAttribute("current_user", "admin");
				session.setAttribute("username", user.getUserName());
				session.setAttribute("message", "Dear admin you are logged in successfully.Welcome to our website");
				response.sendRedirect("admin.jsp");
			}
			else {
				session.setAttribute("current_user", "normal");
				session.setAttribute("username", user.getUserName());
				session.setAttribute("message", user.getUserName()+" you are logged in successfully.Welcome to our website");
				response.sendRedirect("index.jsp");
			}
		}

	}
}
