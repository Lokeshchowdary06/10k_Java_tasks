package demo;

public class Product {
	String productName;
	int productId;
	double productPrice;
	public void addProductDetails(String pn,int pid,double pp)
	{
		this.productName=pn;
		this.productId=pid;
		this.productPrice=pp;
	}
	public String displayDetails()
	{
		return "productName is: "+productName+"\nproductId is: "+productId+"\nproductPrice is: "+productPrice;
	}
	public static void main(String[] args) {
		Product p = new Product();
		p.addProductDetails("Pen", 69, 69.6969);
		System.out.println(p.displayDetails());
	}
}
