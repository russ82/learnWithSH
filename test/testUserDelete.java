import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import controller.AdminController;
import controller.csvController;

class testUserDelete {
	
	AdminController admin = new AdminController();
	csvController csv = new csvController();
	
	@Test
	void testuserDelete() {
		admin.userDelete("jini");
		List<List<String>> allUser = csv.readCSV("userInfo.csv");
		assertEquals(0,allUser.size());
	}

}
