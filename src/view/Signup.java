package view;

import controller.UserController;
import model.UserId;

public class Signup implements View {

	@Override
	public void show() {
		System.out.println("=====ȸ�� ���=====");
		UserId signup = new UserId();
		UserController enroll = new UserController();
		
		System.out.println("�ϰ� ���� id : ");						//������� �Է¹��� ���̵� �������� �ߺ��� ���ٰ� ����
		signup.setId(scan.next());
		System.out.println("�ϰ� ���� password : ");
		signup.setPassword(scan.next());
		System.out.println("�̸� : ");
		signup.setName(scan.next());
		System.out.println("��ȭ��ȣ : ");
		signup.setPhone(scan.next());
		System.out.println("�̸��� : ");
		signup.setEmail(scan.next());
		
		request.put("userId", signup);
		
		//csv�� ����
		enroll.addUser(signup);
		
		//menuController.menuSignUp(signup.UserLineup());
		//action(signup)ȣ��
		
		//�ٽ� �޴�ȣ��
		menuController.menuprocess();
		
	}

}
