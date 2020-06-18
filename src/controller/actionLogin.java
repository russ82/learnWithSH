package controller;

import java.util.ArrayList;

import model.UserId;

public class actionLogin {

	public boolean ActionLogin(String id, String password) {
		//csv에서 읽어오기
		
		
		ArrayList<UserId> user = new ArrayList<UserId>();
		
		//for validation
		boolean flag = false;
		    for(UserId usr:user){
		        if(usr.getId() == id && usr.getPassword() == password){
		         //enter print code here
		          flag = true;
		        }            
		    }
		return flag;
	}
	
	
}
