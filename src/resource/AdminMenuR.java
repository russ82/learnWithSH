package resource;

import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Scanner;

import controller.AdminController;

public interface AdminMenuR {
	
	PrintStream out = System.out;
	
	String adminmenuStr = "1. å ���� 2. ȸ�� ���� 3. ������";
	
	Scanner scan = new Scanner(System.in);
	
	Hashtable<String, Object> adminrequest = new Hashtable<>();
	
	AdminController adminController = new AdminController();
}
