package view;

public class UserDelete implements AdminView{

	public void adminshow() {
		//uid�� ����
		String user;
		System.out.println("======���� ����======");
		
		System.out.println("������ ������ �Է����ּ��� : ");
		user = scanadmin.next();
		
		//å�� ����� ����
		//usercontroller.userdelete(userid);
		//bookcontroller.bookdelete(bookid,userid);
		adminController.adminprocess();
	}
	
}
