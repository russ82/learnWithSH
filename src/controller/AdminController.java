package controller;

import java.util.List;

import resource.AdminMenuR;
import view.AdminView;

public class AdminController implements AdminMenuR {
	
	csvController csv = new csvController();
	List<List<String>> allUser = csv.readCSV("userInfo.csv");
	
	public void adminprocess() {
		
		System.out.println("=====������ �޴�======");
		
		//admin menu ����
		adminMenu.adminshow();
		
		AdminView view = null;
		
		//switch�� ����
		switch((int)adminrequest.get("selectNo")){
		case 1:
			System.out.println("å ���� ����");
			bookDelete.adminshow();
			break;
		case 2:
			System.out.println("å �˻� ����");
			view = bookSearch;
			break;
		case 3:
			System.out.println("���� ���� ����");
			view = userDelete;
			break;
		case 4:
			System.out.println("ȸ�� ���� ���� ����");
			view = userSetting;
			break;
		case 5:
			System.out.println("������ ����");
			exit.adminshow();
			break;
		default:
			System.out.println("�ٽ� �������ּ���");
			adminprocess();	
		}
		view.adminshow();
		
 }
	
	public void userDelete(String userId) {
	
		for (List<String> u: allUser) {
			if (u.get(0).equals(userId) && u.get(5).equals("deactivated")) {
				csv.admindeleteCSV("userInfo.csv", userId, "user");
				csv.admindeleteCSV("bookInfo.csv", userId, "book");
				break;
			}
		}
		
	}
	
	public void userSetting(String userId) {
		
		int index = 0;
		List<List<String>> allUser = csv.readCSV("userInfo.csv");
		for (List<String> u: allUser) {
			if (u.get(0).equals(userId)) {
				break;
			}
			index++;
		}
		List<String> removableUser = allUser.get(index);
		removableUser.set(5, "deactivated");
		allUser.set(index, removableUser);
		
		csv.writeCSV("userInfo.csv", allUser);
		userList();
	}
	
	public void userList() {
		List<List<String>> allUser = csv.readCSV("userInfo.csv");
		
		for (List<String> user: allUser) {
			System.out.println(user);
		}
		
	}
	
}
