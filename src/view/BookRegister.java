package view;

public class BookRegister implements UserView {
	
	public void usershow() {
		System.out.println("====å ���=====");
		
		String userid, title, publisher, author, condition;
		int isbn, year, price;
		String temp;
		char check;
		
		System.out.println("�ڽ���  �������̵� : ");
		userid = scanuser.next();				//next -> nextline�Ǹ� nextline�ѹ� �� ���ֱ�
		scanuser.nextLine();
		
		System.out.println("���� : ");
		title = scanuser.nextLine();
		
		System.out.println("�ٸ� �߰� ������ �Է��Ͻðڽ��ϱ�? y or n�� �������ּ���");
		temp = scanuser.next();
		check = temp.charAt(0);
		
		if(check == 'y') {
			System.out.println("ISBN : ");
			isbn = scanuser.nextInt();
			scanuser.nextLine();
			
			System.out.println("���ǻ� : ");
			publisher = scanuser.nextLine();
			
			System.out.println("���� ���� : ");
			author = scanuser.nextLine();
			
			System.out.println("���� �⵵  : ");
			year = scanuser.nextInt();
			
			System.out.println("���� : ");					
			price = scanuser.nextInt();
			scanuser.nextLine();
			
			System.out.println("���´� excellent or good or fair �� �ϳ��� �Է����ּ���");
			condition = scanuser.next();
			
			bookController.bookAdd(userid, title, isbn, publisher, author, year, price, condition);
			userController.userprocess();
		}
		else if(check == 'n') {
			bookController.bookAdd(userid, title);
			userController.userprocess();
		}
	
	}
	
	
}
