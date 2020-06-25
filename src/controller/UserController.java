package controller;

import model.UserId;
import resource.UserMenuR;
import view.UserView;

public class UserController implements UserMenuR{
	
	//usermenu process
	public void userprocess() {
		System.out.println("======����� �޴�======");
		
		//user menu ����
		//switch�� ����
		
		usermenu.usershow();
		
		UserView view = null;
		
			switch((int)userrequest.get("selectNo")){
				case 1:
					System.out.println("å ���� ����");
					bookDelete.usershow();
					break;
				case 2:
					System.out.println("å ��� ����");
					view = bookRegister;
					break;
				case 3:
					System.out.println("å ���� ���� ����");
					view = bookRevise;
					break;
				case 4:
					System.out.println("å ���� ����");
					view = userPurchase;
					break;
				case 5:
					System.out.println("å �˻� ����");
					bookSearch.usershow();
					break;
				case 6:
					System.out.println("������ ����");
					exit.usershow();
					break;
				default:
					System.out.println("�ٽ� �������ּ���");
					userprocess();	
				}
			view.usershow();
		//�޼ҵ� action(user_login) : user model�� ���� csv�� ������ id , password �޾ƿ�
		
	}
	
	//useraddaction process
	public void addUser(String id, String password, String name, String phone, String email) {
		String condition = "activated";
		UserId user = new UserId(id, password, name, phone, email, condition);
		
		actionAddUser adduser = new actionAddUser();
		adduser.actionaddUser(user);
		
	}
	
	public void purchaseEmail(String seller, String buyer) {
		EmailController email = new EmailController();
		email.EmailSend(seller, buyer);
		
	}
	
	public void loginprocess(String id, String password) {
		MenuController againMenu = new MenuController();
		UserController user = new UserController();
		AdminController admin = new AdminController();
		actionLogin actionlogin = new actionLogin();
		
		if(id.equals("admin") && password.equals("nayana")) {
			System.out.println("������ ����");
			admin.adminprocess();
		}
		else if(actionlogin.ActionLogin(id, password)) {
			System.out.println("����� ����");
			user.userprocess();
		}
		else {
			System.out.println("=====�α��� ����=====");
			System.out.println("****�ٽ� �޴�ȭ������ ���ư��ϴ�****");
			//�ٽ� �α��� �޴��� -> ���� => �޴�ȭ������
			againMenu.menuprocess();
		}
	}
	
	
	
}
