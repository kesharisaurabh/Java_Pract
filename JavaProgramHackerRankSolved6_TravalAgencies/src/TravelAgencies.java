
public class TravelAgencies 
{
	int regNo;
	String agencyName;
	String packageType;
	int price;
	boolean flightFacility;
	
	public void setRegNo(int regNo) {
		this.regNo=regNo;
	}
	public void setAgencyName(String agencyName)
	{
		this.agencyName=agencyName;
	}
	public void setPackageType(String packageType)
	{
		this.packageType=packageType;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setFlightFacility(boolean flightFacility)
	{
		this.flightFacility=flightFacility;
	}
	
	public int getRegNo()
	{
		return regNo;
	}
	public String getAgencyName()
	{
		return agencyName;
	}
	public String getPackageType() {
		return packageType;
	}
	public int getPrice()
	{
		return price;
	}
	public boolean getflightFacility()
	{
		return flightFacility;
	}
	public TravelAgencies(int regNo,String agencyName, String packageType,int price,boolean flightFacility)
	{
		super();
		this.regNo=regNo;
		this.agencyName=agencyName;
		this.packageType=packageType;
		this.price=price;
		this.flightFacility=flightFacility;
	}
}
