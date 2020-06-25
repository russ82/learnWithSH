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
	//user��  csv�� add���Ǵ��� login �Ǵ��� delete�Ǵ��� setting�Ǵ���(10���μ���)
	
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
