package view;

import java.util.List;

public class BookRevise implements UserView{
	
	public void usershow() {
		String userid, retitle;
		String title, publisher, author, condition;
		int isbn, price, year;
		System.out.println("====å ���� ����====");
		
		//å ����Ʈ print
		System.out.println("id�� �Է����ּ���");						//next -> nextline�Ǹ� nextline�ѹ� �� ���ֱ�
		userid = scanuser.next();
		scanuser.nextLine();
		
		for(List<String> book :bookController.bookList(userid)) {
			System.out.println(book);
		}
		
		System.out.println("������ å�� ������ �Է����ּ��� : ");
		retitle = scanuser.nextLine();
		
		System.out.println("å�� ������ �������ּ���");
		
		System.out.println("���� :");
		title = scanuser.nextLine();
		
		System.out.println("isbn : ");
		isbn = scanuser.nextInt();
		scanuser.nextLine();
		
		System.out.println("���ǻ� : ");
		publisher = scanuser.nextLine();
		
		System.out.println("���� ���� : ");
		author = scanuser.nextLine();
		
		System.out.println("���� �⵵  : ");
		year = scanuser.nextInt();
		
		System.out.println("���� : ");					//�ִ� 5��������
		price = scanuser.nextInt();
		scanuser.nextLine();
		
		System.out.println("���� (excellent or good or fair) : ");
		condition = scanuser.nextLine();
		
		//å search
		bookController.bookRevise(userid, retitle, title, isbn, publisher, author, year, price, condition);
		
		userController.userprocess();
	}
	
}
