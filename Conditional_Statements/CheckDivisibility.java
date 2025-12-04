package Conditional_Statements;

public class CheckDivisibility {
	public boolean check(int num)
	{
		return (num%5==0 && num%11==0)?true:false;
	}
	public static void main(String[] args) {
		CheckDivisibility cd = new CheckDivisibility();
		System.out.println("Number divisible by 5 and 11: "+cd.check(55));
		System.out.println("Number divisible by 5 and 11: "+cd.check(69));
	}
}
