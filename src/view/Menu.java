package view;

public class Menu implements View {

	public int choice() {
		System.out.println(menuStr);
		System.out.println("Choice : ");
		return scan.nextInt();
	}
	
	@Override
	public void show() {
		
		System.out.println("=====Menu=====");
		System.out.println(menuStr);
		System.out.println("Choice : ");
		int no = scan.nextInt();
		while(no<0 || no>3) {
			System.out.println("�ٽ� ����ּ���");
			no=choice();
		}
		
		//LoginR�� �Է¹��� ��ȣ�� �־��ְ� �ٽ� Controller����
		request.put("selectNo", no);
		
	}

}
