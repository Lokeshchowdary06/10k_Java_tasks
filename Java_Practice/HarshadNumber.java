package Java_Practice;

public class HarshadNumber {
	public boolean isharshad(int num)
	{
		if(num<=0)
			return false;
		int temp = num;
		int r,s=0;
		while(temp!=0)
		{
			r=temp%10;
			s+=r;
			temp/=10;
		}
		return num%s==0;
	}
	public static void main(String[] args) {
		HarshadNumber hn = new HarshadNumber();
		System.out.println(hn.isharshad(22)?"It is an Harshad Number":"It is not an harshad Number");
	}

}
