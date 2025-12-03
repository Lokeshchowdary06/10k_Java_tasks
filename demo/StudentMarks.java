package demo;

public class StudentMarks {
	int m1;
	int m2;
	int m3;
	public static int total(int a,int b,int c)
	{
		return a+b+c;
	}
	public String isPassed()
	{
		int t=total(69,50,32);
		t++;
		return (t>=120)?"Pass":"Fail";
	}
	public static void main(String[] args) {
		StudentMarks sm = new StudentMarks();
		String status = sm.isPassed();	
		System.out.println("Student is : "+status);
	}
}
