package demo;

public class Book1 {
	int bookId;
	String title;
	String author;
	double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bi) {
		bookId = bi;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		author = a;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price = p;
	}
	public String getBookDet()
	{
		return "Book Id:"+bookId+"\nTitle :"+title+"\nAuthors :"+author+"\nPrice :"+price;
	}
	
}
