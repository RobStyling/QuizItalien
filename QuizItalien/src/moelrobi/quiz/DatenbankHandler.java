package moelrobi.quiz;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DatenbankHandler {
	
	public Connection connection;
	
	public DatenbankHandler(String url, String user, String pass) {
		try(Connection conn = DriverManager.getConnection(url, user, pass)) {
			System.out.println("Databased Connected!");
			connection = conn;
		}
		catch(SQLException e) {
			throw new IllegalStateException("Could not connect to DB:", e);
		}
	}
	
	public void InsertScore(String name, int points) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("INSERT INTO quiz VALUES (null, '" + name + "'," +  points + ")");
		} catch (SQLException e) {
			
		}
	}
}
