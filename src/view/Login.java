package view;

import model.UserId;

public class Login implements View {

	@Override
	public void show() {
		out.println("======·Î±×ÀÎ=======");
		UserId id = new UserId();
		String username;
		String userpassword;
		
		out.println("id : ");
		username = scan.next();
		out.println("password : ");
		userpassword = scan.next();
		
		System.out.println(request.get(id));
		out.println(request.equals("userId.id"));
		out.println(request.equals("userId.password"));
		out.println(request.get("userId"));
		
		
		menuController.menuprocess();
	}

}
