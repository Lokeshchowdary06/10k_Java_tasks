package Conditional_Statements;

public class Task3 {
	public boolean canVote(int age) {
		return (age>=18)?true:false;
	}
	public static void main(String[] args) {
		Task3 t3 = new Task3();
		System.out.println("Can vote (Age 20): " + t3.canVote(20));
		System.out.println("Can vote (Age 18): " + t3.canVote(18));
		System.out.println("Can vote (Age 2): " + t3.canVote(2));
	}
}
