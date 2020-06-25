package model;

public class Book {								//user에 연결되야 하므로 implement로 해야되나...
	private String name;
	private int isbn;
	private String publisher;
	private String author;
	private int date;
	private int price;
	private String condition;
	private String userid;
	
	public Book() {}

	public Book(String name, int isbn, String publisher, String author, int date, int price, String condition, String userid) {
		this.name = name;
		this.isbn = isbn;
		this.publisher = publisher;
		this.author = author;
		this.date = date;
		this.price = price;
		this.condition = condition;
		this.userid = userid;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", publisher=" + publisher + ", author=" + author + ", date=" + date + ", price="
				+ price + ", state=" + condition + "]";
	}
	
	
	
}
