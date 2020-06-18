package view;

import controller.UserController;
import model.UserId;

public class Signup implements View {

	@Override
	public void show() {
		System.out.println("=====회원 등록=====");
		UserId signup = new UserId();
		UserController enroll = new UserController();
		
		System.out.println("하고 싶은 id : ");						//사람마다 입력받은 아이디 같은경우는 중복이 없다고 가정
		signup.setId(scan.next());
		System.out.println("하고 싶은 password : ");
		signup.setPassword(scan.next());
		System.out.println("이름 : ");
		signup.setName(scan.next());
		System.out.println("전화번호 : ");
		signup.setPhone(scan.next());
		System.out.println("이메일 : ");
		signup.setEmail(scan.next());
		
		request.put("userId", signup);
		
		//csv에 저장
		enroll.addUser(signup);
		
		//menuController.menuSignUp(signup.UserLineup());
		//action(signup)호출
		
		//다시 메뉴호출
		menuController.menuprocess();
		
	}

}
