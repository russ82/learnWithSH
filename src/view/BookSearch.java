package view;

import java.util.ArrayList;
import java.util.List;

public class BookSearch implements AdminView, UserView{

	List<List<String>> selectedBook = new ArrayList<List<String>>();
	
	@Override
	public void adminshow() {
		//uid, bookid�� �˻�
		String input, userid;
		
		System.out.println("======å �˻�======");
		
		System.out.println("���� ���̵� : ");
		userid = scanuser.next();
		scanadmin.nextLine();
		
		System.out.println("�˻��ϰ� ���� ����(å�� ����  or ISBN ��ȣ  or ���� or ���ǻ� or ���ǳ⵵ or �Ǹ��� id)�� �Է����ּ���");
		input = scanadmin.nextLine();
		
		for(List<String> selectedBook :bookcontroller.bookSearch(userid,input)) {
			System.out.println(selectedBook);
		}
		adminController.adminprocess();
		
	}
	
	@Override
	public void usershow() {
		String input, userid;
		//uid, bookid�� �˻�
		System.out.println("======å �˻�======");
		
		System.out.println("���� ���̵� : ");
		userid = scanuser.next();
		scanuser.nextLine();
		
		System.out.println("�˻��ϰ� ���� ����(å�� ����  or ISBN ��ȣ  or ���� or ���ǻ� or ���ǳ⵵ or �Ǹ��� id)�� �Է����ּ���");
		input = scanuser.nextLine();
		
		for(List<String> selectedBook :bookcontroller.bookSearch(userid,input)) {
			System.out.println(selectedBook);
		}
		userController.userprocess();
	}
}
