package demo;

public class SumProductCheck {
    public static boolean checkSumVsProduct(int a, int b) {
    	int res=a+b;
    	a++;
    	b++;
    	int res1=a+b;
    	return (res1>res)?true:false;
    }
    public static void main(String[] args) {
    	boolean b=checkSumVsProduct(6, 9);
    	System.out.println(b);
	}
}
