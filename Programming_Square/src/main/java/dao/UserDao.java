package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data_model.User;
import database_connection.Singleton_conn;

public class UserDao {
	
Singleton_conn dbase = Singleton_conn.getInstance();
	
	public void register (User user) {
		
		String query1 = "INSERT INTO users (name , username , email , password) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement statm = dbase.getConnection().prepareStatement(query1 , PreparedStatement.RETURN_GENERATED_KEYS);
			statm.setString(1, user.getName());
			statm.setString(2, user.getUsername());
			statm.setString(3, user.getEmail());
			statm.setString(4, user.getPassword());
			
			int affectedRows = statm.executeUpdate();

			if (affectedRows == 0) {
			    throw new SQLException("Failed to insert data into table");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public boolean loginverify (User user) {
		
		String query2 = ("SELECT * FROM users WHERE username=? and password=?");
		
		PreparedStatement ps;
		try {
			ps = dbase.getConnection().prepareStatement(query2);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

		return false;
		
	}
	
	
	
	public  int getUserId(User user) throws SQLException {
        
      
        String query3 = "SELECT user_id FROM users WHERE username = ? AND password = ?";
        PreparedStatement statement = dbase.getConnection().prepareStatement(query3);
        
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        
        
        ResultSet resultSet = statement.executeQuery();
        
        // Get the user ID from the result set
        int userId = 0;
        if (resultSet.next()) {
            userId = resultSet.getInt("user_id");
        }
        
        return userId;
	}
	
	
	public User getUserByUserid (int userid) {
		
		    String query4 = "SELECT * FROM users WHERE user_id = ?";
	        User user = new User();
	        
	         
			try {
				PreparedStatement statement = dbase.getConnection().prepareStatement(query4);
				statement.setInt(1, userid);
		        
		        ResultSet result = statement.executeQuery();
		        if (result.next()) {
		            String name = result.getString("name");
		            String email = result.getString("email");
		            
		           user.setName(name);
		           user.setEmail(email);
		        }
		        
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        
	        
	        return user;

	}
	
	
	

}
