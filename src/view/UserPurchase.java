package view;

public class UserPurchase implements UserView {

	public void usershow() {
		String selleremail, buyeremail;
		
		System.out.println("=====å ����=====");
		
		System.out.println("�ڽ��� email�� �Է����ּ���");
		buyeremail = scanuser.next();
		System.out.println("�Ǹ��� email�� �Է����ּ���");
		selleremail = scanuser.next();
		
		//�Ǹ��� id�� email���� email�߼�
		//userController.email(�Ǹ���email,������email);
		emailController.Send(selleremail,buyeremail);
		userController.userprocess();
	}
	
}
