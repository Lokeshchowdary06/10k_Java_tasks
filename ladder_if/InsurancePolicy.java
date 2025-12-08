package ladder_if;

public class InsurancePolicy {
	public String calculatePremium(int age, int experience)
	{
		if(age>50 && experience>10)
			return "Lowest Premium";
		else if ((age>30 && age<=50) && experience>5)
			return "Moderate Premium";
		else if ((age>18 && age<=30) && experience<5)
			return "Highest Premium";
		else
			return "Not Eligible for Insurance";
	}
	public static void main(String[] args) {
		InsurancePolicy ip = new InsurancePolicy();
		System.out.println(ip.calculatePremium(35, 6));
	}
}
