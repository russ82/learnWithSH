package controller;

import java.util.List;

public class actionLogin {
	
	public boolean ActionLogin(String id, String password) {
		
		csvController csv = new csvController();
		List<List<String>> UserInfo = csv.readCSV("userInfo.csv");
		
		boolean flag = false;
		
		for(List<String> loginUser: UserInfo) {
			if (loginUser.get(0).equals(id) && loginUser.get(1).equals(password) && loginUser.get(5).equals("activated")) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
}
