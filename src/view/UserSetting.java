package view;

public class UserSetting implements AdminView{
	
	public void adminshow() {
		String userid;
		String temp;
		char check;
		
		System.out.println("====유저 설정====");
		//uid로 유저설정
		System.out.println("아이디"+","+"비밀번호"+","+"이름"+","+ "전화번호"+"," +"이메일"+ "순서 입니다");
		adminController.userList();
		
		System.out.println("상태 변경할 사용자 id를 입력해주세요 : ");
		userid = scanadmin.next();
		
		adminController.userSetting(userid);
		
		System.out.println("관련 유저 정보를 삭제하시겠습니까 ? y or n 로 선택해주세요");
		temp = scanadmin.next();
		check = temp.charAt(0);
		
		if(check == 'y') {
			adminController.userDelete(userid);
			adminController.adminprocess();
		}
		else {
			System.out.println("****관리자 메뉴 화면으로 돌아갑니다****");
			adminController.adminprocess();
		}
		
	}
	
}
