package red;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class RegistrationDao {
	
	private Connection conn;
	Date c= Date.valueOf("2000-01-01");
	
	private final String SQL_SET_USER = "INSERT INTO USERS (USERS_ID,USERS_NAME, USERS_SURNAME,USERS_BIRTH,USERS_USERNAME,USERS_PASSWORD,USERS_CREDITCARD,USERS_LICENCE) " + 
			"VALUES(users_id_seq.NEXTVAL,?,?,?,?,?,?,?)";
	
	public RegistrationDao(DataSource ds) {
		try {
			this.conn = ds.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}
	
	public String setUser(String a, String b, Date c, String d, String e, Long f, String g) {
		String results = new String();

		try {
			PreparedStatement stmt = conn.prepareStatement(SQL_SET_USER);
			stmt.setString(1, a);
			stmt.setString(2, b);
			stmt.setDate(3, c);
			stmt.setString(4, d);
			stmt.setString(5, e);
			stmt.setLong(6, f);
			stmt.setString(7, g);
			stmt.executeQuery();

			
			results= "Registration compleated";
			
			System.out.println();
			
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}

		return results;
	}

}
