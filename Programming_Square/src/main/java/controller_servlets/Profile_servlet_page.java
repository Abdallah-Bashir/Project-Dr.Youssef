package controller_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import dao.PostDao;
import dao.UserDao;
import data_model.User;


public class Profile_servlet_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Profile_servlet_page() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int userId1= (int) session.getAttribute("userid");
		
		UserDao u1 = new UserDao();
		PostDao p1 = new PostDao();

        
        User user = u1.getUserByUserid(userId1);
        
        
        

        
        int numberOfPosts = 0;
        
        numberOfPosts = p1.getNumberOfPostsByUserId(userId1);

      String  name =  user.getName();
      String email = user.getEmail();  
        // Set data as request attributes
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("numberOfPosts", numberOfPosts);

        response.sendRedirect("/Programming_Square/profile.jsp");
        
    }
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
