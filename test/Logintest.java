import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import controller.UserController;
import controller.actionLogin;

public class Logintest {	
	@Test
	public void testActionLogin() {
		UserController user = new UserController();
		user.addUser("jin", "qwer", "jin", "010-3521-2353", "jin@naver.com");
		actionLogin login = new actionLogin();
		boolean check = login.ActionLogin("jin", "qwer");
		assertTrue(check);
		
	}

}
