package controller;

import java.util.ArrayList;
import java.util.List;

import model.UserId;

public class actionAddUser {
	
	public void actionaddUser(UserId user) {
		
		csvController csv = new csvController();
		
		List<String> userlist = new ArrayList<String>();
		
		List<List<String>> IDChecker = csv.readCSV("userInfo.csv");
		List<String> IDSet = new ArrayList<String>();;
		
		for (List<String> u: IDChecker) {
			IDSet.add(u.get(0));
			
		}
		
		for (String id:IDSet) {
			if (id.equals(user.getId())) {
				System.out.println("같은 아이디로는 가입할 수 없습니다!");
				return;
			}
		}
		
		userlist.add(user.getId());
		userlist.add(user.getPassword());
		userlist.add(user.getName());
		userlist.add(user.getPhone());
		userlist.add(user.getEmail());
		userlist.add(user.getCondition());
		//csv에 추가하기
		csv.appendCSV("userInfo.csv", userlist);
		
	}
}
