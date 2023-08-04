package cgg.ecommerceapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import cgg.ecommerceapp.dao.CategoryDao;
import cgg.ecommerceapp.dao.UserDao;

/**
 * Servlet implementation class AddUserCatProd
 */
public class AddUserCatProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserCatProd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String op = request.getParameter("operation");
		
		if(op.trim().equals("adduser")) {
			String username = request.getParameter("user_name");
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");
			String address = request.getParameter("user_address");
			String userphone = request.getParameter("user_phonenumber");
			
			boolean addUser = UserDao.addUser(username, email, password, userphone, address);
			if(addUser) {
				HttpSession session = request.getSession();
				session.removeAttribute("message");
				session.setAttribute("message", "User added Successfully...");
				response.sendRedirect("admin.jsp");
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("message", "Something went wrong try again...");
				response.sendRedirect("admin.jsp");
			}
		}
		else if(op.trim().equals("addcategory")) {
			String cat_name = request.getParameter("category_name");
			String cat_desc = request.getParameter("category_description");
			boolean addCategory = CategoryDao.addCategory(cat_name, cat_desc);
			if(addCategory) {
				HttpSession session = request.getSession();
				session.removeAttribute("message");
				session.setAttribute("message", "Category added Successfully...");
				response.sendRedirect("admin.jsp");
			}
		}
	}

}
