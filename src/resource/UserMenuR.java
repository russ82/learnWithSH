package resource;

import java.io.PrintStream;
import java.util.Hashtable;

import controller.UserController;

public interface UserMenuR {
	
	PrintStream out = System.out;
	
	String usermenuStr = "1. å ���� 2. å ��� 3. å ����";
	
	Hashtable<String, Object> userrequest = new Hashtable<>();
	
	UserController userController = new UserController();
	
	
}
