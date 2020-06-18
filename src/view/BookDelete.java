package view;

public class BookDelete implements AdminView, UserView{			//같은 내용이라 묶기
	
	public void adminshow() {
		System.out.println("=====책 삭제======");
		String bookid;
		String userid;
		
		
		System.out.println("유저 아이디와 삭제할 책 제목을 입력해주세요 ");
		
		System.out.println("책 제목 : ");
		bookid = scanadmin.next();
		System.out.println("uid : ");
		userid = scanadmin.next();
		
		//if(책==개인식별id 와 책id) actiondelete 삭제;
		//bookcontroller.bookdelete(bookid,userid);
		adminController.adminprocess();
	}
	
	public void usershow() {
		System.out.println("=====책 삭제======");
		int bookid;
		
		//자신이 등록한 책들 출력(uid)
		//bookcontroller.booklist(userid);
		
		
		System.out.println("삭제를 원하는 책id를 입력해주세요 : ");
		
		System.out.println("bookid : ");
		bookid = scanadmin.nextInt();
		
		
		//if(책==개인식별id 와 책id) actiondelete 삭제;
		//bookcontroller.bookdelete(bookid,userid);
		userController.userprocess();
	}
	
	
}
