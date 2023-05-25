package controller_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.PostDao;
import data_model.Posts;


public class Newpost_servlet_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Newpost_servlet_page() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession();
		int userId= (int) session.getAttribute("userid");
		
		
		String title = request.getParameter("title");
		String url = request.getParameter("url");
		
		Posts post = new Posts(title , url);
		
		
		PostDao cp1 = new PostDao();
		
		cp1.createpost(post , userId);
		
		response.sendRedirect("/Programming_Square/newpost.jsp");
	}

}
