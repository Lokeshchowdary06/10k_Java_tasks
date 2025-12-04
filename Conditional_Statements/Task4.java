package Conditional_Statements;

public class Task4 {
	public int findGreater(int num1, int num2)
	{
		return (num1>num2)?num1:num2;
	}
	public static void main(String[] args) {
		Task4 t4 = new Task4();
		System.out.println("Greater number (10, 25): " + t4.findGreater(10, 25));
		System.out.println("Greater number (13,69): " + t4.findGreater(13,69));
		System.out.println("Greater number (55,88): " + t4.findGreater(55,88));
	}
}
