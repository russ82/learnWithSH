package view;

public class UserSetting implements AdminView{
	
	public void adminshow() {
		String userid;
		String temp;
		char check;
		
		System.out.println("====���� ����====");
		//uid�� ��������
		System.out.println("���̵�"+","+"��й�ȣ"+","+"�̸�"+","+ "��ȭ��ȣ"+"," +"�̸���"+ "���� �Դϴ�");
		adminController.userList();
		
		System.out.println("���� ������ ����� id�� �Է����ּ��� : ");
		userid = scanadmin.next();
		
		adminController.userSetting(userid);
		
		System.out.println("���� ���� ������ �����Ͻðڽ��ϱ� ? y or n �� �������ּ���");
		temp = scanadmin.next();
		check = temp.charAt(0);
		
		if(check == 'y') {
			adminController.userDelete(userid);
			adminController.adminprocess();
		}
		else {
			System.out.println("****������ �޴� ȭ������ ���ư��ϴ�****");
			adminController.adminprocess();
		}
		
	}
	
}
