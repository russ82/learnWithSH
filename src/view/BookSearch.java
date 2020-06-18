package view;

public class BookSearch implements AdminView, UserView{

	public void adminshow() {
		//uid, bookid로 검색
		String userid, bookid;
		
		System.out.println("======책 검색======");
		
		System.out.println("검색할 유저아이디와 책제목을 입력해주세요");
		
		System.out.println("유저 아이디 : ");
		userid = scanadmin.next();
		System.out.println("책 제목 : ");
		bookid = scanadmin.next();
		
		//bookcontroller.booksearch(userid,bookid);
		adminController.adminprocess();
		
	}
	
	public void usershow() {
		String bookid;
		//uid, bookid로 검색
		System.out.println("======책 검색======");
		
		System.out.println("검색할 책제목을 입력해주세요");
		
		System.out.println("책 제목 : ");
		bookid = scanadmin.next();
		
		//bookcontroller.booksearch(userid,bookid);
		userController.userprocess();
	}
}
