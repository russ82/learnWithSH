package view;

import controller.MenuController;

public class Exit implements View, AdminView, UserView{
	
	@Override
	public void show() {
		System.out.println("=====종료======");
		System.exit(0);
	}
	
	@Override
	public void adminshow() {
		MenuController retMenu = new MenuController();
		
		System.out.println("=====관리자 모드 나가기======");
		//다시 메뉴호출하길 원함
		retMenu.menuprocess();
	}
	
	@Override
	public void usershow() {
		MenuController retMenu = new MenuController();
		
		System.out.println("=======사용자 모드 나가기=======");
		//다시 메뉴호출하길 원함
		retMenu.menuprocess();
	}
	
}
