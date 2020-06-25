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
			System.out.println("다시 골라주세요");
			no=choice();
		}
		
		//LoginR에 입력받은 번호를 넣어주고 다시 Controller실행
		request.put("selectNo", no);
		
	}

}
