package view;

public class UserDelete implements AdminView{

	public void adminshow() {
		//uid로 삭제
		String user;
		System.out.println("======유저 삭제======");
		
		System.out.println("삭제할 유저를 입력해주세요 : ");
		user = scanadmin.next();
		
		//책과 사용자 삭제
		//usercontroller.userdelete(userid);
		//bookcontroller.bookdelete(bookid,userid);
		adminController.adminprocess();
	}
	
}
