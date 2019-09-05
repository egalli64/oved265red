package red;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DaoSuperUser {
	private Connection conn2;

	public DaoSuperUser(DataSource ds2) {
		try {
			this.conn2 = ds2.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}

	public boolean check(String username, String password) {
        try {
        	PreparedStatement pstmt = null;
        	String superUser = "SELECT COUNT (*) FROM superusers WHERE superusers_username=? AND superusers_password=?";
        	pstmt = conn2.prepareStatement(superUser);
        	pstmt.setString(1, username);
        	pstmt.setString(2, password);
   
            ResultSet rs2 = pstmt.executeQuery();
            rs2.next();
            
			if (rs2.getInt(1) == 1)
				return true;

			else
				return false;
            
        } catch (SQLException se) {
            throw new IllegalStateException("Database issue " + se.getMessage());
        }
    }
}
