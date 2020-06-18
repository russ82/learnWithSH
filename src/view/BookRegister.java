package view;

public class BookRegister implements UserView{
	
	public void usershow() {
		System.out.println("====책 등록=====");
		//bookinfo book = new bookinfo();
		String title, publisher, author, condition;
		int price, year;
		
		System.out.println("제목 : ");
		title = scanuser.next();
		
		System.out.println("다른 추가 정보를 입력하시겠습니까? y or n로 선택해주세요");
		char check = scanuser.next().charAt(0);
		if(check == 'y') {
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
