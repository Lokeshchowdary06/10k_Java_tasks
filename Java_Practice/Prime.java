package Java_Practice;

public class Prime {
	public boolean isPrime(int num)
	{
		if(num <= 1)
			return false;
		for(int i=2;i<=(int)Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Prime p = new Prime();
		System.out.println(p.isPrime(13)?"It is a Prime Number":"It is not a Prime Number");
	}

}
