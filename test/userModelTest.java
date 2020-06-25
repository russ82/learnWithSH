import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import model.UserId;

class userModelTest {

	//유저 정보 잘 입력되는지 tostring으로 확인해볼것
	
	@Test
	void testUserId() {
		UserId user = new UserId();
		user.setCondition("activated");
		user.setEmail("qwer@naver.com");
		user.setId("jin");
		user.setName("jinh");
		user.setPassword("qwegasdg");
		user.setPhone("031-235-13513");
		System.out.println(user.toString());
		assertAll("user properties",
				() ->   assertEquals("jin",user.getId()),
				() ->	assertEquals("qwegasdg",user.getPassword())
			);
	}

}
