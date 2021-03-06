package pckg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB 
{
	    private static Connection connection;
	    private String url = "jdbc:postgresql://localhost:5432/nesneY";
	    private String username = "postgres";
	    private String password = "123456";

	    private Connection getDbConnection() {
	        if (connection != null) return connection;
	        try {
	            Class.forName("org.postgresql.Driver");
	            connection = DriverManager.getConnection(url, username, password);
	            System.out.println("Database Connection successful");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
	        }
	        return connection;
	    }

	    public boolean isimDogrula(String isim) {
	        String query = "SELECT * FROM users WHERE username=?;";
	        try {
	            PreparedStatement preQuery = getDbConnection().prepareStatement(query);
	            preQuery.setString(1, isim);
	            ResultSet response = preQuery.executeQuery();
	            return response.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	    public boolean sifreSorgula(String isim, String sifre) {
	        String query = "SELECT * FROM users WHERE username=? and password=?;";
	        try {
	            PreparedStatement preQuery = getDbConnection().prepareStatement(query);
	            preQuery.setString(1, isim);
	            preQuery.setString(2, sifre);
	            ResultSet response = preQuery.executeQuery();
	            return response.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
}
