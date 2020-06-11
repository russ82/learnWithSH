package view;

import model.UserId;

public class Signup implements View {

	@Override
	public void show() {
		out.println("=====회원 등록=====");
		UserId signup = new UserId();
		
		out.println("하고 싶은 id : ");						//사람마다 입력받은 아이디 같은경우는 중복이 없다고 가정
		signup.setId(scan.next());
		out.println("하고 싶은 password : ");
		signup.setPassword(scan.next());
		out.println("이름 : ");
		signup.setName(scan.next());
		out.println("전화번호 : ");
		signup.setPhone(scan.next());
		out.println("이메일 : ");
		signup.setEmail(scan.next());
		
		request.put("userId", signup);
		
		menuController.menuprocess();
		
	}

}
