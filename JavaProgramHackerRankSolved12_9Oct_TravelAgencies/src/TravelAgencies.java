
public class TravelAgencies 
{
	int regNo;
	String angencyName;
	String packageType;
	int price;
	int rating;
	String location;
	
	int getRegNo() {
		return regNo;
	}
	void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	String getAngencyName() {
		return angencyName;
	}
	void setAngencyName(String angencyName) {
		this.angencyName = angencyName;
	}
	String getPackageType() {
		return packageType;
	}
	void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getRating() {
		return rating;
	}
	void setRating(int rating) {
		this.rating = rating;
	}
	String getLocation() {
		return location;
	}
	void setLocation(String location) {
		this.location = location;
	}
	public TravelAgencies(int regNo, String angencyName, String packageType, int price, int rating, String location) {
		super();
		this.regNo = regNo;
		this.angencyName = angencyName;
		this.packageType = packageType;
		this.price = price;
		this.rating = rating;
		this.location = location;
	}
	
	
	
}
