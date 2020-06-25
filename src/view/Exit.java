package view;

import controller.MenuController;

public class Exit implements View, AdminView, UserView{
	
	@Override
	public void show() {
		System.out.println("=====����======");
		System.exit(0);
	}
	
	@Override
	public void adminshow() {
		MenuController retMenu = new MenuController();
		
		System.out.println("=====������ ��� ������======");
		//�ٽ� �޴�ȣ���ϱ� ����
		retMenu.menuprocess();
	}
	
	@Override
	public void usershow() {
		MenuController retMenu = new MenuController();
		
		System.out.println("=======����� ��� ������=======");
		//�ٽ� �޴�ȣ���ϱ� ����
		retMenu.menuprocess();
	}
	
}
