package resource;

import java.util.Hashtable;
import java.util.Scanner;

import controller.UserController;
import view.BookDelete;
import view.BookRegister;
import view.BookRevise;
import view.Exit;
import view.UserMenu;
import view.UserPurchase;

public interface UserMenuR {
	
	String usermenuStr = "1. 책 삭제  2. 책 등록  3. 책 정보 수정 4.책 구입  5. 나가기";
	
	Scanner scanuser = new Scanner(System.in);
	
	Hashtable<String, Object> userrequest = new Hashtable<>();
	
	UserController userController = new UserController();
	
	UserMenu usermenu = new UserMenu();
	BookDelete bookDelete = new BookDelete();
	BookRegister bookRegister = new BookRegister();
	BookRevise bookRevise = new BookRevise();
	UserPurchase userPurchase = new UserPurchase();
	Exit exit = new Exit();
	
}
