package resource;

import java.io.PrintStream;
import java.util.Hashtable;

import controller.UserController;

public interface UserMenuR {
	
	PrintStream out = System.out;
	
	String usermenuStr = "1. 책 구입 2. 책 등록 3. 책 삭제";
	
	Hashtable<String, Object> userrequest = new Hashtable<>();
	
	UserController userController = new UserController();
	
	
}
