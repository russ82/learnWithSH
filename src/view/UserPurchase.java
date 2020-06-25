package view;

public class UserPurchase implements UserView {

	public void usershow() {
		String selleremail, buyeremail;
		
		System.out.println("=====책 구입=====");
		
		System.out.println("자신의 email을 입력해주세요");
		buyeremail = scanuser.next();
		System.out.println("판매자 email을 입력해주세요");
		selleremail = scanuser.next();
		
		//판매자 id와 email통해 email발송
		//userController.email(판매자email,구매자email);
		emailController.Send(selleremail,buyeremail);
		userController.userprocess();
	}
	
}
