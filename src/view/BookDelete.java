package view;

public class BookDelete implements AdminView, UserView{			//���� �����̶� ����
	
	public void adminshow() {
		System.out.println("=====å ����======");
		String bookid;
		String userid;
		
		System.out.println("���� ���̵�� ������ å ������ �Է����ּ��� ");
		
		System.out.println("�������̵� : ");
		userid = scanadmin.next();
		scanadmin.nextLine();
		System.out.println("å ���� : ");
		bookid = scanadmin.nextLine();
		
		bookcontroller.userBookDelete(bookid,userid);		//user�� å������ ����
		adminController.adminprocess();
	}
	
	public void usershow() {
		System.out.println("=====å ����======");
		
		String bookid;
		String userid;
		
		System.out.println("���� ���̵�� ������ å ������ �Է����ּ��� ");
		
		System.out.println("�������̵� : ");
		userid = scanuser.next();
		scanuser.nextLine();
		System.out.println("å ���� : ");
		bookid = scanuser.nextLine();
		
		
		bookController.userBookDelete(bookid,userid);
		userController.userprocess();
	}
	
	
}
