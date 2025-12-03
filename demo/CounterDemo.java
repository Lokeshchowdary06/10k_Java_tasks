package demo;

public class CounterDemo {
	int count=0;
	public void updateAndPrint()
	{
		System.out.println("Value of count : "+count++);
		System.out.println("Updated Value of count :"+count);
		System.out.println("Value of ++count: "+ ++count);
		System.out.println("Final Value of count:"+ count);
	}
	public static void main(String[] args) {
		CounterDemo cd = new CounterDemo();
		cd.count=69;
		cd.updateAndPrint();
	}
}
