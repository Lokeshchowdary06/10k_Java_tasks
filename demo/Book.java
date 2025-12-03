package demo;

public class Book {
	String bookTitle;
	String author;
	String isbn;
	public void addBookDetails(String bt,String a,String isbn)
	{
		this.bookTitle=bt;
		this.author=a;
		this.isbn=isbn;
	}
	public String displayDetails()
	{
		return "bookTitle is: "+bookTitle+"\nauthor is: "+author+"\nisbn is: "+isbn;
	}
	public static void main(String[] args) {
		Book b = new Book();
		b.addBookDetails("Harry Potter", "J K Rowling", "123-456-789-4567");
		System.out.println(b.displayDetails());
	}
}
