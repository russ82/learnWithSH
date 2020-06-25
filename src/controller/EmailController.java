package controller;

import email.EmailAdmin;

public class EmailController extends EmailAdmin{

	public void Send(String seller, String buyer) {
		
		System.out.println(super.EmailSend(seller, buyer));
		
	}
	
}
