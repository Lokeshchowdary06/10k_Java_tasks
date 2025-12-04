package Conditional_Statements;

public class Alphabets {
	public String isVowel(char c)
	{
		return (c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u')?"Vowel":"Consonent";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets a= new Alphabets();
		System.out.println("It is "+a.isVowel('a'));
		System.out.println("It is "+a.isVowel('b'));
	}

}
