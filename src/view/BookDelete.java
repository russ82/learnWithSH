package view;

public class BookDelete implements AdminView, UserView{			//���� �����̶� ����
	
	public void adminshow() {
		System.out.println("=====å ����======");
		String bookid;
		String userid;
		
		
		System.out.println("���� ���̵�� ������ å ������ �Է����ּ��� ");
		
		System.out.println("å ���� : ");
		bookid = scanadmin.next();
		System.out.println("uid : ");
		userid = scanadmin.next();
		
		//if(å==���νĺ�id �� åid) actiondelete ����;
		//bookcontroller.bookdelete(bookid,userid);
		adminController.adminprocess();
	}
	
	public void usershow() {
		System.out.println("=====å ����======");
		int bookid;
		
		//�ڽ��� ����� å�� ���(uid)
		//bookcontroller.booklist(userid);
		
		
		System.out.println("������ ���ϴ� åid�� �Է����ּ��� : ");
		
		System.out.println("bookid : ");
		bookid = scanadmin.nextInt();
		
		
		//if(å==���νĺ�id �� åid) actiondelete ����;
		//bookcontroller.bookdelete(bookid,userid);
		userController.userprocess();
	}
	
	
}
