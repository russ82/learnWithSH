package view;

public class BookSearch implements AdminView, UserView{

	public void adminshow() {
		//uid, bookid�� �˻�
		String userid, bookid;
		
		System.out.println("======å �˻�======");
		
		System.out.println("�˻��� �������̵�� å������ �Է����ּ���");
		
		System.out.println("���� ���̵� : ");
		userid = scanadmin.next();
		System.out.println("å ���� : ");
		bookid = scanadmin.next();
		
		//bookcontroller.booksearch(userid,bookid);
		adminController.adminprocess();
		
	}
	
	public void usershow() {
		String bookid;
		//uid, bookid�� �˻�
		System.out.println("======å �˻�======");
		
		System.out.println("�˻��� å������ �Է����ּ���");
		
		System.out.println("å ���� : ");
		bookid = scanadmin.next();
		
		//bookcontroller.booksearch(userid,bookid);
		userController.userprocess();
	}
}
