package demo;

public class PayrollSystem {
	public static void main(String[] args) {
		Employee1 e= new Employee1();
		e.setEmployeeId(123);
		e.setEmployeeName("Lokesh Chowdary");
		e.setSalary(6969.69);
		System.out.println(e.getEmployeedet());
		e.setSalary(e.getSalary()+69.69);
		System.out.println("Updated Salary :"+e.getSalary());
	}

}
