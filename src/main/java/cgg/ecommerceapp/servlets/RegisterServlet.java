package cgg.ecommerceapp.servlets;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cgg.ecommerceapp.dao.UserDao;
import cgg.ecommerceapp.entities.Users;
import cgg.ecommerceapp.helpers.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class registerServlet1
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String phno = request.getParameter("user_phonenumber");
		String address = request.getParameter("user_address");
		
		UserDao.addUser(name, email, password, phno, address);
		
		response.sendRedirect("login.jsp");
//		Session session = Connection.getSession();
//		
//		Transaction tx = session.beginTransaction();
//		
//		Users user = new Users();
//		user.setUserName(name);
//		user.setUserEmail(email);
//		user.setUserPassword(password);
//		user.setUserph(phno);
//		user.setUseraddress(address);
//		user.setUserType("normal");
//		
//		session.save(user);
//		tx.commit();
//		session.close();
		
	}

}
