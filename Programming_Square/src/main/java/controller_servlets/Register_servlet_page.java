package controller_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import dao.UserDao;
import data_model.User;


public class Register_servlet_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register_servlet_page() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		User user1 = new User (name , username , email , password);
		UserDao u1 = new UserDao();
		u1.register(user1);
		
		try {
			int userid  = u1.getUserId(user1);
			HttpSession session = request.getSession();
			session.setAttribute("userid", userid);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("/Programming_Square/home_after_login.jsp");
		
		
	}

}
