package view;

import controller.UserController;

public class Login implements View {			//�α��� �������̽���

	@Override
	public void show() {
		System.out.println("======�α���=======");
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
