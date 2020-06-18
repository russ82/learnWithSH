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
	
	String usermenuStr = "1. å ����  2. å ���  3. å ���� ���� 4.å ����  5. ������";
	
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
