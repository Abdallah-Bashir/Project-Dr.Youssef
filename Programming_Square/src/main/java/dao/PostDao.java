package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data_model.Posts;
import database_connection.Singleton_conn;

public class PostDao {
	
   Singleton_conn dbase = Singleton_conn.getInstance();
	
	public void createpost (Posts post , int user_id) {
		
		
		String query = "INSERT INTO posts (title,url,user_id) VALUES (?,?,?)";
		
		try {
			PreparedStatement ps = dbase.getConnection().prepareStatement(query);
			ps.setString(1, post.getTitle());
			ps.setString(2, post.getUrl());
			ps.setInt(3, user_id);
			
			int rs  = ps.executeUpdate();
			
			if (rs == 0) {
			    throw new SQLException("Failed to insert data into table");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public int getNumberOfPostsByUserId(int userid){
		
		String query2 = "SELECT COUNT(*) AS count FROM posts WHERE user_id = ?";
        int numberOfPosts = 0; 
        
         
		try {
			PreparedStatement statement = dbase.getConnection().prepareStatement(query2);
			statement.setInt(1, userid);
	        
	        ResultSet result = statement.executeQuery();
	        
	        if (result.next()) {
	            numberOfPosts = result.getInt("count");
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        return numberOfPosts;
    }
	
	
	
	public List<Posts> getAllPosts()  {
		
        List<Posts> posts = new ArrayList<>();

        String query3 = "SELECT * FROM posts";
        
		try {
			PreparedStatement pstmt = dbase.getConnection().prepareStatement(query3);
			ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            
	            String title = rs.getString("title");
	            String url = rs.getString("url");
	            

	            Posts post = new Posts(title, url);
	            posts.add(post);
	        }
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        

        return posts;
    }

}


