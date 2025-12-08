package demo;

public class Value {
	public static void operations(int a, int b, char c)
	{
		if(c=='+')
		{
			System.out.println("Value is :" + (a+b));
		}
		else if(c=='-')
		{
			System.out.println("Value is :" + (a-b));
		}
		else if(c=='*')
		{
			System.out.println("Value is :" + (a*b));
		}
		else if(c=='/')
		{
			System.out.println("Value is :" + (a/b));
		}
		else
		{
			System.out.println("Invalid Operator");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter operators like +,-,*,/");
		operations(10, 60, '+');
	}

}
