package view;

import model.UserId;

public class Signup implements View {

	@Override
	public void show() {
		out.println("=====ȸ�� ���=====");
		UserId signup = new UserId();
		
		out.println("�ϰ� ���� id : ");						//������� �Է¹��� ���̵� �������� �ߺ��� ���ٰ� ����
		signup.setId(scan.next());
		out.println("�ϰ� ���� password : ");
		signup.setPassword(scan.next());
		out.println("�̸� : ");
		signup.setName(scan.next());
		out.println("��ȭ��ȣ : ");
		signup.setPhone(scan.next());
		out.println("�̸��� : ");
		signup.setEmail(scan.next());
		
		request.put("userId", signup);
		
		menuController.menuprocess();
		
	}

}
