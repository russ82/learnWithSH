package resource;

import java.util.Hashtable;
import java.util.Scanner;

import controller.MenuController;
import view.Exit;
import view.Login;
import view.Menu;
import view.Signup;

public interface MenuR {
	
	String menuStr = "1. �α���  2. ȸ������  3. ������";
	
	Scanner scan = new Scanner(System.in);
	
	Hashtable<String, Object> request = new Hashtable<>();
	
	MenuController menuController = new MenuController();
	
	Menu menu = new Menu();
	Login login = new Login();
	Signup signup = new Signup();
	Exit exit = new Exit();

}
