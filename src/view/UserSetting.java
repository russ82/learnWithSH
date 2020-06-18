package view;

public class UserSetting implements AdminView{
	
	public void adminshow() {
		String uid;
		
		System.out.println("====유저 설정====");
		//uid로 유저설정
		System.out.println("사용자 id를 입력해주세요 : ");
		uid = scanadmin.next();
		
		//admincontroller.usersetting(uid,deactivated);
		
		System.out.println("관련 유저 정보를 삭제하시겠습니까 ? y or n 로 선택해주세요");
		char check = scanadmin.next().charAt(0);
		if(check == 'y') {
			//admincontroller.userdelete(userid);
			//admincontroller.bookdelete(userid); => 모두삭제
			adminController.adminprocess();
		}
		else {
			System.out.println("****관리자 메뉴 화면으로 돌아갑니다****");
			adminController.adminprocess();
		}
		
	}
	
}
