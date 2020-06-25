package controller;

import resource.MenuR;
import view.View;

public class MenuController implements MenuR{
	
		public void menuprocess() {
			
			menu.show();
			
			View view = null;
			
			switch((int)request.get("selectNo")){
			case 1:
				System.out.println("로그인 선택");
				view = login;
				break;
			case 2:
				System.out.println("회원가입 선택");
				view = signup;
				break;
			case 3:
				System.out.println("나가기 선택");
				exit.show();
				break;
			default:
				System.out.println("다시 선택해주세요");
				menuprocess();	
			}
			view.show();
	}
		
}
