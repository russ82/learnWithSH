package view;

import controller.UserController;

public class Signup implements View {

	@Override
	public void show() {
		System.out.println("=====ȸ�� ���=====");
		String id, password, name, phone, email;
		UserController enroll = new UserController();
		
		System.out.println("�ϰ� ���� id : ");				
		id = scan.next();
		
		System.out.println("�ϰ� ���� password : ");
		password = scan.next();
		
		System.out.println("�̸� : ");
		name = scan.next();
		
		System.out.println("��ȭ��ȣ : ");
		phone = scan.next();
		
		System.out.println("�̸��� : ");
		email = scan.next();
		
		enroll.addUser(id,password,name,phone,email);
		
		
		//�ٽ� �޴�ȣ��
		menuController.menuprocess();
		
	}

}
