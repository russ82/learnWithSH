package view;

import java.util.List;

public class BookRevise implements UserView{
	
	public void usershow() {
		String userid, retitle;
		String title, publisher, author, condition;
		int isbn, price, year;
		System.out.println("====책 정보 수정====");
		
		//책 리스트 print
		System.out.println("id를 입력해주세요");						//next -> nextline되면 nextline한번 더 써주기
		userid = scanuser.next();
		scanuser.nextLine();
		
		for(List<String> book :bookController.bookList(userid)) {
			System.out.println(book);
		}
		
		System.out.println("수정할 책의 제목을 입력해주세요 : ");
		retitle = scanuser.nextLine();
		
		System.out.println("책의 내용을 수정해주세요");
		
		System.out.println("제목 :");
		title = scanuser.nextLine();
		
		System.out.println("isbn : ");
		isbn = scanuser.nextInt();
		scanuser.nextLine();
		
		System.out.println("출판사 : ");
		publisher = scanuser.nextLine();
		
		System.out.println("저자 정보 : ");
		author = scanuser.nextLine();
		
		System.out.println("출판 년도  : ");
		year = scanuser.nextInt();
		
		System.out.println("가격 : ");					//최대 5만원으로
		price = scanuser.nextInt();
		scanuser.nextLine();
		
		System.out.println("상태 (excellent or good or fair) : ");
		condition = scanuser.nextLine();
		
		//책 search
		bookController.bookRevise(userid, retitle, title, isbn, publisher, author, year, price, condition);
		
		userController.userprocess();
	}
	
}
