
public class AutonomousCar 
{
	int carId;
	String brand;
	int noOfTestsConducted;
	int noOfTestsPassed;
	String environment;
	String grade;
	
	public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPassed = noOfTestsPassed;
		this.environment = environment;
		
	}
	int getCarId() {
		return carId;
	}
	void setCarId(int carId) {
		this.carId = carId;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	int getNoOfTestsConducted() {
		return noOfTestsConducted;
	}
	void setNoOfTestsConducted(int noOfTestsConducted) {
		this.noOfTestsConducted = noOfTestsConducted;
	}
	int getNoOfTestsPassed() {
		return noOfTestsPassed;
	}
	void setNoOfTestsPassed(int noOfTestsPassed) {
		this.noOfTestsPassed = noOfTestsPassed;
	}
	String getEnvironment() {
		return environment;
	}
	void setEnvironment(String environment) {
		this.environment = environment;
	}
	String getGrade() {
		return grade;
	}
	void setGrade(String grade) {
		this.grade = grade;
	}
	
}
