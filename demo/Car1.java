package demo;

public class Car1 {
	int carId;
	String brand;
	String model;
	double rentalPricePerDay;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int ci) {
		carId = ci;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String b) {
		brand = b;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String m) {
		model = m;
	}
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(double rpd) {
		rentalPricePerDay = rpd;
	}
	public String getCarDet()
	{
		return "Car id :"+carId+"\nbarnd :"+brand+"\nModel :"+model+"\nRental Price Per day:"+rentalPricePerDay;
	}
	
}
