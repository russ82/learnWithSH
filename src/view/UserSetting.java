package view;

public class UserSetting implements AdminView{
	
	public void adminshow() {
		String uid;
		
		System.out.println("====���� ����====");
		//uid�� ��������
		System.out.println("����� id�� �Է����ּ��� : ");
		uid = scanadmin.next();
		
		//admincontroller.usersetting(uid,deactivated);
		
		System.out.println("���� ���� ������ �����Ͻðڽ��ϱ� ? y or n �� �������ּ���");
		char check = scanadmin.next().charAt(0);
		if(check == 'y') {
			//admincontroller.userdelete(userid);
			//admincontroller.bookdelete(userid); => ��λ���
			adminController.adminprocess();
		}
		else {
			System.out.println("****������ �޴� ȭ������ ���ư��ϴ�****");
			adminController.adminprocess();
		}
		
	}
	
}
