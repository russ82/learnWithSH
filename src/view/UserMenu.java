package view;

public class UserMenu implements UserView{
	
	public int choice() {
		System.out.println(usermenuStr);
		System.out.println("Choice : ");
		return scanuser.nextInt();
	}
	
	@Override
	public void usershow() {
		
		System.out.println("=====User Menu=====");
		System.out.println(usermenuStr);
		System.out.println("Choice : ");
		int no = scanuser.nextInt();
		while(no<0 || no>6) {
			System.out.println("�ٽ� ����ּ���");
			no=choice();
		}
		
		//LoginR�� �Է¹��� ��ȣ�� �־��ְ� �ٽ� Controller����
		userrequest.put("selectNo", no);
	}
	
}
