package red;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class AdminRegistrationDao {
	
	private Connection conn;
	Date c= Date.valueOf("2000-01-01");
	
	private final String SQL_SET_ADMIN = "INSERT INTO SUPERUSERS (SUPERUSERS_ID,SUPERUSERS_NAME, SUPERUSERS_SURNAME,SUPERUSERS_BIRTH,SUPERUSERS_USERNAME,SUPERUSERS_PASSWORD) " + 
			"VALUES(superusers_id_seq.NEXTVAL,?,?,?,?,?)";
	
	public AdminRegistrationDao(DataSource ds) {
		try {
			this.conn = ds.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}
	
	public String setAdmin(String a, String b, Date c, String d, String e) {
		String results = new String();

		try {
			PreparedStatement stmt = conn.prepareStatement(SQL_SET_ADMIN);
			stmt.setString(1, a);
			stmt.setString(2, b);
			stmt.setDate(3, c);
			stmt.setString(4, d);
			stmt.setString(5, e);
			stmt.executeQuery();

			
			results= "Registration compleated";
			
			System.out.println();
			
		} catch (SQLException se) {
			if ((se.getMessage()).contains("USERNAME")) {
				results="e-mail already used";
				return results;
			} else if ((se.getMessage()).contains("LICENCE")) {
				results="Licence already used";
			} else {
			throw new IllegalStateException("Database issue " + se.getMessage());
			}
		}

		return results;
	}

}
