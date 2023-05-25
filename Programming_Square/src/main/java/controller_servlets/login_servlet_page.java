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


public class login_servlet_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public login_servlet_page() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user1 = new User (username,password);
		UserDao  u1 = new UserDao();
		boolean check =u1.loginverify(user1);
		
		try {
			int userid  = u1.getUserId(user1);
			HttpSession session = request.getSession();
			session.setAttribute("userid", userid);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (check == true)
		{
			response.sendRedirect("/Programming_Square/home_after_login.jsp");
		}
		else
		{
			response.sendRedirect("/Programming_Square/sign_in.jsp");
		}
				
		
	}

}
