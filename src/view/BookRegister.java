package view;

public class BookRegister implements UserView{
	
	public void usershow() {
		System.out.println("====å ���=====");
		//bookinfo book = new bookinfo();
		String title, publisher, author, condition;
		int price, year;
		
		System.out.println("���� : ");
		title = scanuser.next();
		
		System.out.println("�ٸ� �߰� ������ �Է��Ͻðڽ��ϱ�? y or n�� �������ּ���");
		char check = scanuser.next().charAt(0);
		if(check == 'y') {
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
		}
		else if(check == 'n') {
			publisher = null;
			author = null;
			year = 0;
			price = 0;
			condition = null;
		}
		
		//bookcontroller.bookadd(book);
		userController.userprocess();
		
	}
	
	
}
