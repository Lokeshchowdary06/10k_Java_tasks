package Operators;

public class Task2 {
	public static boolean isAllowed(int age, boolean id) {
		return (age>18) && id;
		
	}
	public static void main(String[] args) {
		System.out.println("Allowed Status: "+isAllowed(21, true));
		System.out.println("Allowed Status: "+isAllowed(10, true));
		System.out.println("Allowed Status: "+isAllowed(69, false));
		System.out.println("Allowed Status: "+isAllowed(06, true));
		
	}

}
