import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import controller.BookController;
import controller.csvController;

class BookTest {

	//å�� delete add revise search list�ߵǴ���
	//��ü 10�� list�� ���� �� �����غ���
	//disabled annotationȰ��
	
	BookController bookcontroller = new BookController();
	static csvController csv = new csvController();
	List<List<String>> allBook = csv.readCSV("bookInfo.csv");
	
	@BeforeAll
	public static void setup() {
		System.out.println("booktest");
	}
	
	@Test
	void testBookAdd() {
		bookcontroller.bookAdd("jin", "himama", 10, "auro", "author", 2020, 15000, "good");
		List<List<String>> allBook = csv.readCSV("bookInfo.csv");
		assertEquals(2,allBook.size());
	}
	
	@Test
	void testBookDelete() {
		bookcontroller.adminBookDelete("jin");
		List<List<String>> allBook = csv.readCSV("bookInfo.csv");
		assertEquals(0,allBook.size());
	}

	
	@Test
	void testBookRevise() {
		bookcontroller.bookAdd("jin", "himama", 10, "auro", "author", 2020, 15000, "good");
		bookcontroller.bookRevise("jin", "himama", "hima", 9, "aset", "asdg", 1241, 235314, "fair");
		assertTrue(!(bookcontroller.bookSearch("jin", "hima").contains("hima")));
	}

	@Test
	void testBookSearch() {
		bookcontroller.bookAdd("jin", "himama", 10, "auro", "author", 2020, 15000, "good");
		assertTrue(!(bookcontroller.bookSearch("jin", "hima").contains("himama")));
	}

	@Test
	void testBookList() {
		List<List<String>> allBook = csv.readCSV("bookInfo.csv");
		assertEquals(1,allBook.size());
	}

}
