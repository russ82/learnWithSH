package email;

public class EmailAdmin {
	
	public String EmailSend(String selleremail, String buyeremail) {
		
		String send = "판매자 : "+selleremail+" "+"구매자 : "+buyeremail+" "+"메일이 전송되었습니다.";
		return send;
		
	}
}
