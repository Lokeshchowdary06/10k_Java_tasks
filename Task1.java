

public class Task1 {
	public static void beforeunaryOperators(int x, int y) {
		System.out.println("Performing arthamatic operations before Unary Operations");
		System.out.println("Adition: " + (x + y));
		System.out.println("Subtraction: " + (x - y));
		System.out.println("Multiplication: " + (x * y));
		System.out.println("Division: " + (x / y));
		System.out.println("Modulus: " + (x % y));

	}

	public static void afterunaryOperators(int x, int y) {
		System.out.println("\nPerforming arthamatic operations After Unary Operations");
		System.out.println("Adition: " + (++x + y++));
		System.out.println("Subtraction: " + (++x - y++));
		System.out.println("Multiplication: " + (++x * y++));
		System.out.println("Division: " + (++x / y++));
		System.out.println("Modulus: " + (++x % y++));
	}

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		beforeunaryOperators(x, y);
		afterunaryOperators(x, y);
	}
}
