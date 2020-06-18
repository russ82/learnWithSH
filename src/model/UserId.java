package model;

import java.util.ArrayList;
import java.util.List;

public class UserId {						//userid 데이터타입 저장
	private String id;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String condition;
	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public UserId() {}
	
	public UserId(String id, String password, String name, String phone, String email, String condition) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		if(condition == null) {
			this.condition = "activated";
		}
		else {
			this.condition = condition;
		}
	}
	
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
	
	public List<String> UserLineup(){
		List<String> userlist = new ArrayList<String>();
		
		userlist.add(id);
		userlist.add(password);
		userlist.add(name);
		userlist.add(phone);
		userlist.add(email);
		
		return userlist;
	}
	
}
