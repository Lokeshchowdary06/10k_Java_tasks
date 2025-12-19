package Library;

public class LibrarySystem {
	public static void main(String[] args) {
		Book_blc b= new Book_blc(101,"Harry Potter", 2);
		System.out.println(b.showbookDetails());
		while(b.getavailablecopies()!=0)
		{
			b.borrowBook();
		}
		while((b.getavailablecopies()<b.getac())){
			b.returnBook();
		}
		System.out.println("Library System Transactions");
	}
}
