package view;

public class UserPurchase implements UserView {

	public void usershow() {
		String sellerid;
		
		System.out.println("=====å ����=====");
		
		System.out.println("������ email�� �Է����ּ���");
		//scanuser.next();
		
		//�Ǹ��� id�� email���� email�߼�
		//userController.email(�Ǹ���email,������email);
		userController.purchaseEmail("qwer","asdf");
		userController.userprocess();
	}
	
}
