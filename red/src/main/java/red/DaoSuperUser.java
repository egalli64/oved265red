package red;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<SuperUser> getSuperUser(String username) {
        List<SuperUser> results2 = new ArrayList<>();
        
        PreparedStatement pstmt = null;
        String superUser = "SELECT superusers_id, superusers_name, superusers_surname, superusers_birth, superusers_username, superusers_password FROM superusers WHERE superusers_username=? AND superusers_password='EmanueleBaldi-93'";

        try {
        	pstmt = conn2.prepareStatement(superUser);
        	pstmt.setString(1, username);
   
            ResultSet rs2 = pstmt.executeQuery();
            
            while (rs2.next()) {
                results2.add(new SuperUser(rs2.getLong("SUPERUSERS_ID"), rs2.getString("SUPERUSERS_NAME"), rs2.getString("SUPERUSERS_SURNAME"), rs2.getDate("SUPERUSERS_BIRTH"), rs2.getString("SUPERUSERS_USERNAME"), rs2.getString("SUPERUSERS_PASSWORD")));
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Database issue " + se.getMessage());
        }

        return results2;
    }

}