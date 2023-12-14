package groceryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/groceriesdb";
		String user = "postgres";
		String password = "1";
		String sqlInsertTemplate = "INSERT INTO TESTING (id, first, last, age) VALUES (?, ?, ?, ?)";
		try(Connection conn = DriverManager.getConnection(url, user, password); 
				Statement stmt = conn.createStatement();
				PreparedStatement pstmt = conn.prepareStatement(sqlInsertTemplate);){
			
			
			
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public String printGreeting() {
		return "Welcome to the groceries app!";
	}
	
}
