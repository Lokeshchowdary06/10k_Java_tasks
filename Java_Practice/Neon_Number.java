package Java_Practice;

public class Neon_Number {
	public static boolean isNeon(int num)
	{
		int sum=0;
		int sq=(int)Math.pow(num,2);
//		System.out.println(sq);
		while(sq!=0)
		{
			int r= sq%10;
			sum+=r;
			sq/=10;
		}
		return (sum==num)?true:false;
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		if(isNeon(i))
			System.out.println(i+ " is an neon Number");
	}

}
