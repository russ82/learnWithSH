import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import controller.EmailController;

class emailTest {

	//email잘 보내지는지 (필요가없네)
	
	@Test
	void testEmailSend() {
		EmailController email = new EmailController();
		String seller = "jin@naver.com";
		String buyer = "qwer@gmail.com";
		assertEquals("판매자 : "+seller+" "+"구매자 : "+buyer+" "+"메일이 전송되었습니다.",email.EmailSend(seller, buyer));
		
	}

}
