package view;

import controller.UserController;

public class Login implements View {			//로그인 인터페이스로

	@Override
	public void show() {
		System.out.println("======로그인=======");
		String username;
		String userpassword;
		UserController userlogin = new UserController();
		
		System.out.println("id : ");
		username = scan.next();
		
		System.out.println("password : ");
		userpassword = scan.next();
		
		userlogin.loginprocess(username,userpassword);
		
	}

}
