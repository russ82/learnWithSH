package view;

public class BookRegister implements UserView {
	
	public void usershow() {
		System.out.println("====책 등록=====");
		
		String userid, title, publisher, author, condition;
		int isbn, year, price;
		String temp;
		char check;
		
		System.out.println("자신의  유저아이디 : ");
		userid = scanuser.next();				//next -> nextline되면 nextline한번 더 써주기
		scanuser.nextLine();
		
		System.out.println("제목 : ");
		title = scanuser.nextLine();
		
		System.out.println("다른 추가 정보를 입력하시겠습니까? y or n로 선택해주세요");
		temp = scanuser.next();
		check = temp.charAt(0);
		
		if(check == 'y') {
			System.out.println("ISBN : ");
			isbn = scanuser.nextInt();
			scanuser.nextLine();
			
			System.out.println("출판사 : ");
			publisher = scanuser.nextLine();
			
			System.out.println("저자 정보 : ");
			author = scanuser.nextLine();
			
			System.out.println("출판 년도  : ");
			year = scanuser.nextInt();
			
			System.out.println("가격 : ");					
			price = scanuser.nextInt();
			scanuser.nextLine();
			
			System.out.println("상태는 excellent or good or fair 중 하나를 입력해주세요");
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
