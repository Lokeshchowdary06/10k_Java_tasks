package demo;

public class Library {
	public static void main(String[] args) {
		Book1 b1 = new Book1();
		Book1 b2 = new Book1();
		b1.setBookId(1);
		b1.setTitle("Harry Potter");
		b1.setAuthor("J.K.Rowling");
		b1.setPrice(6969.69);
		b2.setBookId(2);
		b2.setTitle("Varanasi");
		b2.setAuthor("SSR");
		b2.setPrice(123456.69);
		System.out.println(b1.getBookDet());
		System.out.println(b2.getBookDet());
	}
}
