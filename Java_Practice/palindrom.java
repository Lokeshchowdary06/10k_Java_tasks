package Java_Practice;

public class palindrom {
		public static void main(String[] args) {
			int num=123;
			int temp = num;
			int s=0;
			while(temp!=0)
			{
				int r=temp%10;
				 s=s*10+r;
				temp/=10;
			}
			System.out.print(s);
			System.out.println((s==num)?" is a Palindrome Number":" is not a plaindrome");
		}
}
