package red;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class DaoUser {
	private Connection conn;
	private final String SQL_GET_USER = "select users_id, users_name, users_surname, users_birth, users_password, users_username, users_creditcard, users_licence\r\n"
			+ "from users where users_username= ? and users_password= ?";
//	private final String SQL_GET_USER = "select * from users where users_username= ? and users_password= ?";

	public DaoUser(DataSource ds) {
		try {
			this.conn = ds.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}

	public List<User> getUsers(String a, String b) {
		List<User> results = new ArrayList<>();

		try {
			PreparedStatement stmt = conn.prepareStatement(SQL_GET_USER);
			stmt.setString(1, a);
			stmt.setString(2, b);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				results.add(new User(rs.getLong("USERS_ID"), rs.getString("USERS_NAME"), rs.getString("USERS_SURNAME"),
						rs.getDate("USERS_BIRTH"), rs.getString("USERS_PASSWORD"), rs.getString("USERS_USERNAME"),
						rs.getLong("USERS_CREDITCARD"), rs.getString("USERS_LICENCE")));
			}
			
			System.out.println();
			
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}

		return results;
	}

}
