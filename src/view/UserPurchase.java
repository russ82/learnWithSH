package view;

public class UserPurchase implements UserView {

	public void usershow() {
		String sellerid;
		
		System.out.println("=====책 구입=====");
		
		System.out.println("구매자 email을 입력해주세요");
		//scanuser.next();
		
		//판매자 id와 email통해 email발송
		//userController.email(판매자email,구매자email);
		userController.purchaseEmail("qwer","asdf");
		userController.userprocess();
	}
	
}
