package view;

public class Menu implements View {

	public int choice() {
		out.println(menuStr);
		out.println("Choice : ");
		return scan.nextInt();
	}
	
	@Override
	public void show() {
		
		out.println("=====Menu=====");
		out.println(menuStr);
		out.print("Choice : ");
		int no = scan.nextInt();
		while(no<0 || no>3) {
			out.println("�ٽ� ����ּ���");
			no=choice();
		}
		
		//LoginR�� �Է¹��� ��ȣ�� �־��ְ� �ٽ� Controller����
		request.put("selectNo", no);
		
		//userController.loginprocess();
	}

}
