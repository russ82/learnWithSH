import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import controller.EmailController;

class emailTest {

	//email�� ���������� (�ʿ䰡����)
	
	@Test
	void testEmailSend() {
		EmailController email = new EmailController();
		String seller = "jin@naver.com";
		String buyer = "qwer@gmail.com";
		assertEquals("�Ǹ��� : "+seller+" "+"������ : "+buyer+" "+"������ ���۵Ǿ����ϴ�.",email.EmailSend(seller, buyer));
		
	}

}
