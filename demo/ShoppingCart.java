package demo;

public class ShoppingCart {
	public static void main(String[] args) {
		Product1 p= new Product1();
		p.setproductId(69);
		p.setproductName("Pen");
		p.setPrice(10.0d);
		p.setquantity(10);
		System.out.println(p.getProdDetails());
	}

}
