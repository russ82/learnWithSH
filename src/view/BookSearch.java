package view;

import java.util.ArrayList;
import java.util.List;

public class BookSearch implements AdminView, UserView{

	List<List<String>> selectedBook = new ArrayList<List<String>>();
	
	@Override
	public void adminshow() {
		//uid, bookid로 검색
		String input, userid;
		
		System.out.println("======책 검색======");
		
		System.out.println("유저 아이디 : ");
		userid = scanuser.next();
		scanadmin.nextLine();
		
		System.out.println("검색하고 싶은 내용(책의 제목  or ISBN 번호  or 저자 or 출판사 or 출판년도 or 판매자 id)을 입력해주세요");
		input = scanadmin.nextLine();
		
		for(List<String> selectedBook :bookcontroller.bookSearch(userid,input)) {
			System.out.println(selectedBook);
		}
		adminController.adminprocess();
		
	}
	
	@Override
	public void usershow() {
		String input, userid;
		//uid, bookid로 검색
		System.out.println("======책 검색======");
		
		System.out.println("유저 아이디 : ");
		userid = scanuser.next();
		scanuser.nextLine();
		
		System.out.println("검색하고 싶은 내용(책의 제목  or ISBN 번호  or 저자 or 출판사 or 출판년도 or 판매자 id)을 입력해주세요");
		input = scanuser.nextLine();
		
		for(List<String> selectedBook :bookcontroller.bookSearch(userid,input)) {
			System.out.println(selectedBook);
		}
		userController.userprocess();
	}
}
