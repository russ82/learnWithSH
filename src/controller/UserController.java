package controller;

import model.UserId;
import resource.UserMenuR;
import view.UserView;

public class UserController implements UserMenuR{
	
	//usermenu process
	public void userprocess() {
		System.out.println("======사용자 메뉴======");
		
		//user menu 구현
		//switch문 선택
		
		usermenu.usershow();
		
		UserView view = null;
		
			switch((int)userrequest.get("selectNo")){
				case 1:
					System.out.println("책 삭제 선택");
					bookDelete.usershow();
					break;
				case 2:
					System.out.println("책 등록 선택");
					view = bookRegister;
					break;
				case 3:
					System.out.println("책 정보 수정 선택");
					view = bookRevise;
					break;
				case 4:
					System.out.println("책 구입 선택");
					view = userPurchase;
					break;
				case 5:
					System.out.println("책 검색 선택");
					bookSearch.usershow();
					break;
				case 6:
					System.out.println("나가기 선택");
					exit.usershow();
					break;
				default:
					System.out.println("다시 선택해주세요");
					userprocess();	
				}
			view.usershow();
		//메소드 action(user_login) : user model을 통해 csv로 접근해 id , password 받아옴
		
	}
	
	//useraddaction process
	public void addUser(String id, String password, String name, String phone, String email) {
		String condition = "activated";
		UserId user = new UserId(id, password, name, phone, email, condition);
		
		actionAddUser adduser = new actionAddUser();
		adduser.actionaddUser(user);
		
	}
	
	public void purchaseEmail(String seller, String buyer) {
		EmailController email = new EmailController();
		email.EmailSend(seller, buyer);
		
	}
	
	public void loginprocess(String id, String password) {
		MenuController againMenu = new MenuController();
		UserController user = new UserController();
		AdminController admin = new AdminController();
		actionLogin actionlogin = new actionLogin();
		
		if(id.equals("admin") && password.equals("nayana")) {
			System.out.println("관리자 성공");
			admin.adminprocess();
		}
		else if(actionlogin.ActionLogin(id, password)) {
			System.out.println("사용자 성공");
			user.userprocess();
		}
		else {
			System.out.println("=====로그인 실패=====");
			System.out.println("****다시 메뉴화면으로 돌아갑니다****");
			//다시 로그인 메뉴로 -> 실패 => 메뉴화면으로
			againMenu.menuprocess();
		}
	}
	
	
	
}
