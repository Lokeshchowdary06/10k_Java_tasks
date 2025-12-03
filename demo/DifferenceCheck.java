package demo;

public class DifferenceCheck {
	public static int checkDifference(int x,int y,int z) {
		int result = (x-y-z);
		System.out.println("Result of x-y-z: "+ result);
		++result;
		return result-(x-y-z);
	}
	public static void main(String[] args) {
		int x=16;
		int y=9;
		int z=5;
		System.out.println("Difference check:"+checkDifference(x, y, z));
	}

}