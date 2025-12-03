package demo;

public class Car {
	String carMake;
	String carModel;
	int manufacturingYear;
	public void addCarDetails(String cm , String cmake,int my) {
		this.carModel=cm;
		this.carMake=cmake;
		this.manufacturingYear=my;
	}
	public String displayDetails()
	{
		return "carModel is: "+carModel+"\ncarModel is: "+carMake+"\nmanufacturingYear is: "+manufacturingYear;
	}
	public static void main(String[] args) {
		Car c= new Car();
		c.addCarDetails("Toyota", "Hilux", 2025);
		System.out.println(c.displayDetails());
	}
}
