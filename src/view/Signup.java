package view;

import controller.UserController;

public class Signup implements View {

	@Override
	public void show() {
		System.out.println("=====회원 등록=====");
		String id, password, name, phone, email;
		UserController enroll = new UserController();
		
		System.out.println("하고 싶은 id : ");				
		id = scan.next();
		
		System.out.println("하고 싶은 password : ");
		password = scan.next();
		
		System.out.println("이름 : ");
		name = scan.next();
		
		System.out.println("전화번호 : ");
		phone = scan.next();
		
		System.out.println("이메일 : ");
		email = scan.next();
		
		enroll.addUser(id,password,name,phone,email);
		
		
		//다시 메뉴호출
		menuController.menuprocess();
		
	}

}
