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
			System.out.println("다시 골라주세요");
			no=choice();
		}
		
		//LoginR에 입력받은 번호를 넣어주고 다시 Controller실행
		userrequest.put("selectNo", no);
	}
	
}
