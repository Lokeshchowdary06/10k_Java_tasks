package demo;

public class Employee1 {
	int employeeId;
	String employeeName;
	double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int ei) {
		employeeId = ei;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String en) {
		employeeName = en;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		salary = s;
	}
	public String getEmployeedet()
	{
		return "Employee id :"+employeeId+"\nEmployee Name:"+employeeName+"\nSalary :"+salary;
	}

}
