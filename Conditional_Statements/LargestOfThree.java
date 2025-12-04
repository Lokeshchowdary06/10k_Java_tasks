package Conditional_Statements;

public class LargestOfThree {
	public int largest(int a, int b,int c) {
		return (a>b && a>c)?a:(b>c)?b:c;
	}
	public static void main(String[] args) {
		LargestOfThree l= new LargestOfThree();
		System.out.println("largest of three numbers: "+l.largest(5, 105, 100));
		System.out.println("largest of three numbers: "+l.largest(500, 105, 100));
		System.out.println("largest of three numbers: "+l.largest(5, 10, 100));
	}
}
