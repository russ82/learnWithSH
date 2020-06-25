import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import controller.AdminController;
import controller.UserController;
import controller.csvController;
import model.UserId;

class UserTest {
	//user가  csv에 add가되는지 login 되는지 delete되는지 setting되는지(10개로세팅)
	
	UserId user = new UserId();
	AdminController admin = new AdminController();
	UserController usercontroller = new UserController();
	csvController csv = new csvController();
	
	
	@BeforeAll
	public static void setup() {
		System.out.println("usertest");
	}
	
	@Test
	public void testuserAdd() {
		usercontroller.addUser("jini", "qwer", "jinh", "0135135", "jin@naver.com");
		List<List<String>> allUser = csv.readCSV("userInfo.csv");
		assertEquals(1,allUser.size());
	}

	@Test
	void testuserSetting() {
		admin.userSetting("jini");
		List<List<String>> allUser = csv.readCSV("userInfo.csv");
		for (List<String> user: allUser) {
			if (user.contains("jini")) {
				assertTrue(user.get(5).equals("deactivated"));
				break;
			}
		}
	}
	
}
