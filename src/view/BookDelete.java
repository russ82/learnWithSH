package view;

public class BookDelete implements AdminView, UserView{			//같은 내용이라 묶기
	
	public void adminshow() {
		System.out.println("=====책 삭제======");
		String bookid;
		String userid;
		
		System.out.println("유저 아이디와 삭제할 책 제목을 입력해주세요 ");
		
		System.out.println("유저아이디 : ");
		userid = scanadmin.next();
		scanadmin.nextLine();
		System.out.println("책 제목 : ");
		bookid = scanadmin.nextLine();
		
		bookcontroller.userBookDelete(bookid,userid);		//user의 책삭제와 동일
		adminController.adminprocess();
	}
	
	public void usershow() {
		System.out.println("=====책 삭제======");
		
		String bookid;
		String userid;
		
		System.out.println("유저 아이디와 삭제할 책 제목을 입력해주세요 ");
		
		System.out.println("유저아이디 : ");
		userid = scanuser.next();
		scanuser.nextLine();
		System.out.println("책 제목 : ");
		bookid = scanuser.nextLine();
		
		
		bookController.userBookDelete(bookid,userid);
		userController.userprocess();
	}
	
	
}
