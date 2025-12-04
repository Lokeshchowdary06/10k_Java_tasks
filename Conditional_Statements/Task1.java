package Conditional_Statements;

public class Task1 {
	public boolean isEven(int num) {
		return (num%2==0)?true:false;
	}
	public static void main(String[] args) {
		Task1 t= new Task1();
		System.out.println("Is 10 even: " + t.isEven(10));
		System.out.println("Is 10 even: " + t.isEven(11));
	}
}
