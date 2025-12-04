package Conditional_Statements;

public class Task5 {
	public boolean isDivisibleBy5(int num)
	{
		return (num%5==0)?true:false;
	}
	public static void main(String[] args) {
		Task5 t5 = new Task5();
		System.out.println("Is 15 divisible by 5? " + t5.isDivisibleBy5(15));
		System.out.println("Is 15 divisible by 5? " + t5.isDivisibleBy5(69));
	}
}
