package Library;

public class Book_blc {
	private int bookid;
	private String title;
	private int availablecopies;
	private int ac;
	public Book_blc(int bookid,String title,int availablecopies)
	{
		this.bookid=bookid;
		this.title=title;
		this.availablecopies=availablecopies;
		this.ac=availablecopies;
	}
	public String showbookDetails()
	{
		return "Book Details:\nBook ID: "+bookid+"\nTitle: "+title+"\nAvailable copies: "+availablecopies;
	}
	public void borrowBook()
	{
		availablecopies--;
		System.out.println("\nAttempting to borrow a book... \r\n"
				+ "Book borrowed successfully! Updated Available Copies:"
				+ availablecopies);
		if(availablecopies<=0)
			System.out.println("\nAttempting to borrow a book... \r\n"
					+ "Book is not available for borrowing.");
	}
	public void returnBook()
	{
		availablecopies++;
		System.out.println("\nAttempting to return a book...\r\n"
				+ "Book returned successfully! Updated Available Copies:"+availablecopies);
	}
	public int getavailablecopies()
	{
		return availablecopies;
	}
	public int getac()
	{
		return ac;
	}
}
