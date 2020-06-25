import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import model.Book;

class bookModelTest {

	//책 정보 잘 입력되는지 tostring으로 확인해볼것
	
	@Test
	void testBook() {
		
		Book book = new Book();
		book.setAuthor("author");
		book.setCondition("good");
		book.setDate(2020);
		book.setIsbn(10);
		book.setName("himama");
		book.setPrice(15000);
		book.setPublisher("auro");
		book.setUserid("jin");
		System.out.println(book.toString());
 assertAll("book properties",
	() ->   assertEquals("himama",book.getName()),
	() ->	assertEquals(10,book.getIsbn()),
	() ->	assertEquals("jin",book.getUserid())
		);
	}
}
