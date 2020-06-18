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
			System.out.println("다시 골라주세요");
			no=choice();
		}
		
		//LoginR에 입력받은 번호를 넣어주고 다시 Controller실행
		adminrequest.put("selectNo", no);
		
		//userController.loginprocess();
	}
	
}
