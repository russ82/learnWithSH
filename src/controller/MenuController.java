package controller;

import resource.MenuR;
import view.View;

public class MenuController implements MenuR{
	
		public void menuprocess() {
			
			out.println("menucontroller ����");
			
			menu.show();
			
			View view = null;
			
			switch((int)request.get("selectNo")){
			case 1:
				out.println("�α��� ����");
				view = login;
				break;
			case 2:
				out.println("ȸ������ ����");
				view = signup;
				break;
			case 3:
				out.println("������");
				view = exit;
				break;
			default:
				out.println("�ٽ� �������ּ���");
				menuprocess();	
			}
			view.show();
	}
		
		
}
