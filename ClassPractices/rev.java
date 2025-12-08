package ClassPractices;

public class rev {
	public static void main(String[] args) {
		int num=6969;
		int temp = num;
		int s=0;
		while(temp!=0)
		{
			int r=temp%10;
			 s=s*10+r;
			temp/=10;
		}
		System.out.println(s);
	}

}
