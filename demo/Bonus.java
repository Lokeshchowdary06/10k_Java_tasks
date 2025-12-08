package demo;

public class Bonus {
	public static void bonusEmp(int sal,int exp , int rating)
	{
		int bonusamt=0;
		if(exp>5 && rating>=9)
		{
			bonusamt=(int)(sal*0.5);
			System.out.println("Bonus amount is:"+bonusamt);
		}
		else if((exp>3 && exp<=5) && (rating>5 && rating<=9))
		{
			bonusamt=(int)(sal*0.3);
			System.out.println("Bonus amount is:"+bonusamt);
		}
		else if((exp>1 && exp<=3) && (rating>3 && rating<=5 ))
		{
			bonusamt=(int)(sal*0.1);
			System.out.println("Bonus amount is:"+bonusamt);
		}
		else
		{
			System.out.println("No Increment in salary");
		}
		
	}
	public static void main(String[] args) {
		bonusEmp(20000, 3, 5);
	}

}
