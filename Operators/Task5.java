package Operators;

public class Task5 {
	public static boolean validate(int a, int b, int c)  {
		return (a > b && b < c) || !(a == c);
	}
	public static void main(String[] args) {
		int a=2;
		int b=5;
		int c=69;
		System.out.println("Result after Validation: "+validate(a, b, c));
		System.out.println("Result after Validation: "+validate(69, 69, 69));
	}
}
