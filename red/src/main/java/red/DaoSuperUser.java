package red;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import Admin.SuperUser;

public class DaoSuperUser {
	private Connection conn2;
	private String superUser = "SELECT  * FROM superusers WHERE superusers_username=? AND superusers_password=?";

	public DaoSuperUser(DataSource ds) {
		try {
			this.conn2 = ds.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}

	public List<SuperUser> getSuperUsers(String a, String b) {
		List<SuperUser> results = new ArrayList<>();

		try {
			PreparedStatement stmt = conn2.prepareStatement(superUser);
			stmt.setString(1, a);
			stmt.setString(2, b);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				results.add(new SuperUser(rs.getLong("SUPERUSERS_ID"), rs.getString("SUPERUSERS_NAME"),
						rs.getString("SUPERUSERS_SURNAME"), rs.getDate("SUPERUSERS_BIRTH"),
						rs.getString("SUPERUSERS_PASSWORD"), rs.getString("SUPERUSERS_USERNAME")));
			}

			System.out.println();

		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}

		return results;
	}

}
