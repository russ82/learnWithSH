package model;

public class UserId {						//userid 데이터타입 저장
	private String id;
	private String password;
	private String name;
	private String phone;
	private String email;
	
	public UserId() {}
	
	public UserId(String id, String password, String name, String phone, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	//UserData.addUser(UserId);
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserId [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", email="
				+ email + "]";
	}

	
	
}
