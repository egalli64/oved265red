package red;

import java.sql.Date;

public class SuperUser {
	private long superId;
	private String superName;
	private String superSurname;
	private Date superBirth;
	private String superUsername;
	private String superPassword;


	public SuperUser() {
		
	}
	
	public SuperUser(long superId, String superName, String superSurname, Date superBirth, String superPassword, String superUsername) {
		this.superId=superId;
		this.superName=superName;
		this.superSurname=superSurname;
		this.superBirth=superBirth;
		this.superUsername=superUsername;
		this.superPassword=superPassword;

	}

	public long getSuperId() {
		return superId;
	}

	public void setSuperId(long superId) {
		this.superId = superId;
	}

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}

	public String getSuperSurname() {
		return superSurname;
	}

	public void setSuperSurname(String superSurname) {
		this.superSurname = superSurname;
	}

	public Date getSuperBirth() {
		return superBirth;
	}

	public void setSuperBirth(Date superBirth) {
		this.superBirth = superBirth;
	}

	public String getSuperPassword() {
		return superPassword;
	}

	public void setSuperPassword(String superPassword) {
		this.superPassword = superPassword;
	}

	public String getSuperUsername() {
		return superUsername;
	}

	public void setSuperUsername(String superUsername) {
		this.superUsername = superUsername;
	}
}