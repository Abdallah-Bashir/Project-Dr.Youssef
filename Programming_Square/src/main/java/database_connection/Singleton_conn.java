package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton_conn {
	
	private static Singleton_conn instance;
    private Connection connection;

    private Singleton_conn() {
        // private constructor to prevent instantiation outside the class
        String url = "jdbc:mysql://localhost:3306/programmingsquare_db";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Singleton_conn getInstance() {
        if (instance == null) {
            synchronized (Singleton_conn.class) {
                if (instance == null) {
                    instance = new Singleton_conn();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
    

}
