package view;

public class AdminMenu implements AdminView{
	
	public int choice() {
		System.out.println(adminmenuStr);
		System.out.println("Choice : ");
		return scanadmin.nextInt();
	}
	
	@Override
	public void adminshow() {
		
		System.out.println("=====Admin Menu=====");
		System.out.println(adminmenuStr);
		System.out.println("Choice : ");
		int no = scanadmin.nextInt();
		while(no<0 || no>5) {
			System.out.println("�ٽ� ����ּ���");
			no=choice();
		}
		
		//LoginR�� �Է¹��� ��ȣ�� �־��ְ� �ٽ� Controller����
		adminrequest.put("selectNo", no);
		
		//userController.loginprocess();
	}
	
}
