package view;

public class BookRevise implements UserView{

	public void usershow() {
		//bookinfo book = new bookinfo();
		String revise, bookid;
		String title, publisher, author, condition;
		int price, year;
		System.out.println("====å ���� ����====");
		
		//å ����Ʈ print
		//bookcontroller.booklist(userid);
		
		System.out.println("���ϴ� ������ å�� �������ּ��� : ");
		bookid = scanuser.next();
		
		System.out.println("å�� ������ �������ּ���");
	
		System.out.println("���� : ");
		title = scanuser.next();
		System.out.println("���ǻ� : ");
		publisher = scanuser.next();
		//bookinfo.settitle
		System.out.println("���� ���� : ");
		author = scanuser.next();
		System.out.println("���� �⵵  : ");
		year = scanuser.nextInt();
		System.out.println("���� : ");					//�ִ� 5��������
		price = scanuser.nextInt();
		System.out.println("���� : ");
		condition = scanuser.next();
		
		//å search
		//bookcontroller.bookrevise(book);
		
		userController.userprocess();
	}
	
}
