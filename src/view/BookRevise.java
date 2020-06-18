package view;

public class BookRevise implements UserView{

	public void usershow() {
		//bookinfo book = new bookinfo();
		String revise, bookid;
		String title, publisher, author, condition;
		int price, year;
		System.out.println("====책 정보 수정====");
		
		//책 리스트 print
		//bookcontroller.booklist(userid);
		
		System.out.println("원하는 수정할 책을 선택해주세요 : ");
		bookid = scanuser.next();
		
		System.out.println("책의 내용을 수정해주세요");
	
		System.out.println("제목 : ");
		title = scanuser.next();
		System.out.println("출판사 : ");
		publisher = scanuser.next();
		//bookinfo.settitle
		System.out.println("저자 정보 : ");
		author = scanuser.next();
		System.out.println("출판 년도  : ");
		year = scanuser.nextInt();
		System.out.println("가격 : ");					//최대 5만원으로
		price = scanuser.nextInt();
		System.out.println("상태 : ");
		condition = scanuser.next();
		
		//책 search
		//bookcontroller.bookrevise(book);
		
		userController.userprocess();
	}
	
}
