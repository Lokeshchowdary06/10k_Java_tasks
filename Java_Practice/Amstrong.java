package Java_Practice;

public class Amstrong {
	public int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public boolean isAmstrong(int num)
	{
		int exp = count(num);
		int temp = num;
		int sum=0;
		int digit=0;
		while(temp != 0)
		{
			digit=temp%10;
			sum+=(int)Math.pow(digit, exp);
			temp/=10;
		}
		return (sum==num)?true:false;
	}
	public static void main(String[] args) {
		Amstrong a = new Amstrong();
		if(a.isAmstrong(154))
			System.out.println("It is an Amstrong Number");
		else
			System.out.println("Not an Armsrong Number");
	}

}
