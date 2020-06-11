package model;

public class LoginUser extends UserId {
	
	private String id;
	private String password;
	
	public void UserId(String id, String password) {
		this.id = id;
		this.password = password;
	}
}
