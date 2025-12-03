package demo;

public class BankApplication {
	public static void main(String[] args) {
		bankAccount b= new bankAccount();
		b.setAccounhtnumber(123456789);
		b.setAccountHolderName("Lokesh");
		b.setBalance(69.69);
		System.out.println(b.getAccdetails());
		b.setBalance(b.getBalance()+69);
		System.out.println(b.getBalance());
	}

}
