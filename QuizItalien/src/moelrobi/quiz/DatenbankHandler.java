package moelrobi.quiz;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

public class DatenbankHandler {
	
	/*For Personal Reference:
	 * CREATE TABLE `flbk_rob`.`quiz` (
  		`ID` INT(11) NOT NULL AUTO_INCREMENT,
  		`Name` TEXT CHARACTER SET 'latin1' NOT NULL,
  		`Points` INT(11) NOT NULL,
  		PRIMARY KEY (`ID`));
	 * For Creating the Database!
	 */
	
	private static String url;
	private static String user;
	private static String pass;
	
	public DatenbankHandler(String url, String user, String pass) {
		if(url == null || user == null || pass == null) throw new IllegalArgumentException("Bitte fülle alle Parameter aus");
		DatenbankHandler.url = url;
		DatenbankHandler.user = user;
		DatenbankHandler.pass = pass;
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getScore() { //Getting the Score. 
		ResultSet res = null;
		ArrayList<String> scoreboard = new ArrayList<>();
		scoreboard.add("Name / Points");
		try(Connection conn = DriverManager.getConnection(url, user, pass)) {
			Statement st = conn.createStatement();
			res = st.executeQuery("SELECT * FROM quiz ORDER BY Points DESC;");
			while(res.next()) {
				scoreboard.add(res.getString("Name") + " / " + res.getInt("Points"));
			}
		}
		catch(SQLException e) {
			Logger.getLogger(DatenbankHandler.class.getName()).log(Level.SEVERE, null, e);
		}
		return scoreboard;
	}
	
	public void InsertScore(String name, int points) {
		try(Connection conn = DriverManager.getConnection(url, user, pass)) {
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO quiz VALUES (null, '" + name + "'," +  points + ")");
		}
		catch (SQLException e) {
			Logger.getLogger(DatenbankHandler.class.getName()).log(Level.SEVERE, null, e);
		}
	}
}
