
public class Task3 {
	public static void bitwise(int x, int y) {
		System.out.println("Bitwise AND operation : " + (x & y));
		System.out.println("Bitwise OR operation : " + (x | y));
		System.out.println("Bitwise XOR operation : " + (x ^ y));
		System.out.println("Bitwise LEFT SHIFT operation : " + (x << y));
		System.out.println("Bitwise RIGHT SHIFT operation : " + (x >> y));
	}

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		bitwise(a, b);

	}

}
