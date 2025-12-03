package demo;

public class CarRentalservices {
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		c1.setCarId(1);
		c1.setBrand("Toyota");
		c1.setModel("XUV");
		c1.setRentalPricePerDay(6969.69);
		c2.setCarId(2);
		c2.setBrand("Mahindra");
		c2.setModel("Sedian");
		c2.setRentalPricePerDay(696969.69);
		System.out.println(c1.getCarDet());
		System.out.println(c2.getCarDet());
	}
}
