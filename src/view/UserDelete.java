package view;

public class UserDelete implements AdminView{

	public void adminshow() {
		//uid�� ����
		String user;
		System.out.println("======���� ����======");
		
		System.out.println("������ ������ �Է����ּ��� : ");
		user = scanadmin.next();
		
		//å�� ����� ����
		adminController.userDelete(user);
		adminController.adminprocess();
	}
	
}
