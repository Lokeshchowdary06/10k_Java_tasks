package demo;

public class Employee {
	String employeeName;
	int employeeId;
	double employeeSalary;
	public void addEmployeeDetails(String en,int eid,double esal) {
		this.employeeId=eid;
		this.employeeName=en;
		this.employeeSalary=esal;
	}
	public String displayDetails()
	{
		return "employeeName is: "+employeeName+"\n"+"employeeId is: "+employeeId
+"\n"+"employeeSalary is:"+employeeSalary;
	}
	public static void main(String[] args) {
		 Employee e = new Employee();
		 e.addEmployeeDetails("Lokesh Chowdary", 69, 69000.69);
		 System.out.println(e.displayDetails());
		 
	}
}
