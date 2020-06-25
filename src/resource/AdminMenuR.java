package resource;

import java.util.Hashtable;
import java.util.Scanner;

import controller.AdminController;
import controller.BookController;
import view.AdminMenu;
import view.BookDelete;
import view.BookSearch;
import view.Exit;
import view.UserDelete;
import view.UserSetting;

public interface AdminMenuR {
	
	String adminmenuStr = "1. å ����  2. å �˻� 3. ��Ȱ��ȭȸ�� ����  4. ȸ������ ����  5. ������";
	
	Scanner scanadmin = new Scanner(System.in);
	
	Hashtable<String, Object> adminrequest = new Hashtable<>();
	
	AdminController adminController = new AdminController();
	BookController bookcontroller = new BookController();
	
	AdminMenu adminMenu = new AdminMenu();
	BookDelete bookDelete = new BookDelete();
	BookSearch bookSearch = new BookSearch();
	UserDelete userDelete = new UserDelete();
	UserSetting userSetting = new UserSetting();
	Exit exit = new Exit();
	
}
