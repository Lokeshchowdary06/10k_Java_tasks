package Conditional_Statements;

public class Task2 {
	public String checkNumber(int num) {
		return (num==0)?"Zero":(num>0)?"Positive":"Negative";
	}
	public static void main(String[] args) {
		Task2 t2 = new Task2();
		System.out.println("Given number is: "+t2.checkNumber(0));
		System.out.println("Given number is: "+t2.checkNumber(10));
		System.out.println("Given number is: "+t2.checkNumber(-15));
		
	}
}
