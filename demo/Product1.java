package demo;

public class Product1 {
	int productId;
	String productName;
	double price;
	int quantity;
	public void setproductId(int pi)
	{
		productId=pi;
	}
	public void setproductName(String pn)
	{
		productName=pn;
	}
	public void setPrice(double p) {
		price=p;
	}
	public void setquantity(int q)
	{
		quantity=q;
	}
	public int getproductId()
	{
		return productId;
	}
	public String getproductName()
	{
		return productName;
	}
	public double getprice()
	{
		return price;
	}
	public int getquantity()
	{
		return quantity;
	}
	public String getProdDetails()
	{
		return "Product id:"+productId+"\nProduct Name:"+productName+"\nPrice"+price+"\nQuantity"+quantity;
	}
	
}
