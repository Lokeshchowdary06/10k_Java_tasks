package demo;

public class Grade {
	public static void gradeCheck(int mar)
	{
		if(mar>90 && mar<=100)
		{
			System.out.println("Grade A");
		}
		else if(mar>80 && mar<=90)
		{
			System.out.println("Grade B");
		}
		else if(mar>70 && mar<=80)
		{
			System.out.println("Grade C");
		}
		else if(mar>60 && mar<=70)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		gradeCheck(88);
	}

}
