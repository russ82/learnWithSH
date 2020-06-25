package controller;

import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookController {  
	
	csvController csv = new csvController();
	List<List<String>> allBook = csv.readCSV("bookInfo.csv");
	
	public void userBookDelete(String title , String userId) {
		csv.userdeleteCSV("bookInfo.csv", title, userId);
	}
	
	public void adminBookDelete(String userId) {
		csv.admindeleteCSV("bookInfo.csv", userId, "book");
	}
	
	public void bookAdd(String uid, String title) {
		int isbn = 0;
		String publisher = " ";
		String author = " ";
		int year = 0;
		int price = 0;
		String condition = " ";
		
		List<String> inputData = new ArrayList<String>();
		Book book = new Book(title, isbn, publisher, author, year, price, condition, uid);
		
		inputData.add(book.getName());
		inputData.add(Integer.toString(book.getIsbn()));
		inputData.add(Integer.toString(book.getPrice()));
		inputData.add(book.getAuthor());
		inputData.add(book.getPublisher());
		inputData.add(Integer.toString(book.getDate()));
		inputData.add(book.getCondition());
		inputData.add(book.getUserid());
		
		csv.appendCSV("bookInfo.csv", inputData);
		
	}
	
	public void bookAdd(String uid, String title, int isbn, String publisher, String author, int year, int price, String condition) {
		List<String> inputData = new ArrayList<String>();
		Book book = new Book(title, isbn, publisher, author, year, price, condition, uid);
		
		inputData.add(book.getName());
		inputData.add(Integer.toString(book.getIsbn()));
		inputData.add(Integer.toString(book.getPrice()));
		inputData.add(book.getAuthor());
		inputData.add(book.getPublisher());
		inputData.add(Integer.toString(book.getDate()));
		inputData.add(book.getCondition());
		inputData.add(book.getUserid());
		
		csv.appendCSV("bookInfo.csv", inputData);
	}
	
	public void bookRevise(String userId, String retitle, String title, int isbn, String publisher, String author, int year, int price, String condition) {
		
		for (List<String> book: allBook) {
			if (book.contains(retitle) && book.contains(userId)) {
				book.set(0, title);
				book.set(1, Integer.toString(isbn));
				book.set(2, publisher);
				book.set(3, author);
				book.set(4, Integer.toString(year));
				book.set(5, Integer.toString(price));
				book.set(6, condition);
			}
		}
		csv.writeCSV("bookInfo.csv", allBook);
	}
	
	public List<List<String>> bookSearch(String userId, String input) {
		List<List<String>> allBook = csv.readCSV("bookInfo.csv");
		List<List<String>> selectedBook = new ArrayList<List<String>>();
		
		for (List<String> book: allBook) {
			if (book.contains(input) && book.contains(userId)) {
				selectedBook.add(book);
			}
		}
		
		return selectedBook;
		
	}
	
	public List<List<String>> bookList(String userId) {
		List<List<String>> selectedBook = new ArrayList<List<String>>();
		List<List<String>> allBook = csv.readCSV("bookInfo.csv");
		
		if(userId.equals("admin")) {
			return allBook;
			}
		else {
			for (List<String> book: allBook) {
				if (book.contains(userId)) {
					selectedBook.add(book);
				}
			}
			return selectedBook;
		}
	}
	
}
