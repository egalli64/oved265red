package red;

import java.sql.Date;


public class User {
	private long id;
	private String name;
	private String surname;
	private Date birth;
	private String password;
	private String username;
	private long creditcard;
	private String licence;

	public User() {
		
	}
	
	public User(long id, String name, String surname, Date date, String password, String username, long creditcard, String licence) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.birth=date;
		this.password=password;
		this.username=username;
		this.creditcard=creditcard;
		this.licence=licence;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(long creditcard) {
		this.creditcard = creditcard;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}
	
	

}
