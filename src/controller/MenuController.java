package controller;

import resource.MenuR;
import view.View;

public class MenuController implements MenuR{
	
		public void menuprocess() {
			
			menu.show();
			
			View view = null;
			
			switch((int)request.get("selectNo")){
			case 1:
				System.out.println("�α��� ����");
				view = login;
				break;
			case 2:
				System.out.println("ȸ������ ����");
				view = signup;
				break;
			case 3:
				System.out.println("������ ����");
				exit.show();
				break;
			default:
				System.out.println("�ٽ� �������ּ���");
				menuprocess();	
			}
			view.show();
	}
		
}
