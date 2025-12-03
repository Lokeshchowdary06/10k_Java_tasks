package demo;

public class bankAccount {
	long accounhtnumber;
	String accountHolderName;	
	double balance;
	public long getAccounhtnumber() {
		return accounhtnumber;
	}
	public void setAccounhtnumber(long an) {
		accounhtnumber = an;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String ah) {
		accountHolderName = ah;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double b) {
		balance = b;
	}
	public String getAccdetails()
	{
		return "Account Number"+accounhtnumber+"\nName :"+accountHolderName+"\nBalance :"+balance;
	}
	
}
