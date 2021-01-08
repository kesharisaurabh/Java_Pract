/**
 * 
 */

/**
 * @author SAURABH KESHARI
 *
 */
public class Appliance 
{
	int applianceId;
	String applianceName;
	String applianceCategory;
	double applianceAmount;
	boolean insurance;
	

	
	public void setApplianceId(int applianceId )
	{
		this.applianceId=applianceId;
	}
	public void setApplianceName(String applianceName) {
		this.applianceName=applianceName;
		
	}
	public void setApplianceCategory(String applianceCategory)
	{
		this.applianceCategory=applianceCategory;
		
	}
	
	public void setApplianceAmount(double applianceAmount) {
		this.applianceAmount=applianceAmount;
		
	}
	public void setInsurance(boolean insurance) {
		this.insurance=insurance;
		
	}
	
	public int getApplianceId() {
		return applianceId;
	}
	public String getApplianceName() {
		return applianceName;
	}
	public String getApplianceCategory() {
		return applianceCategory;
	}
	public double getApplianceAmount() {
		return applianceAmount;
	}
	public boolean getInsurance() {
		return insurance;
	}
	
	Appliance(int applianceId,String applianceName,String applianceCategory,double applianceAmount)
	{
		super();
		this.applianceId=applianceId;
		this.applianceName=applianceName;
		this.applianceCategory=applianceCategory;
		this.applianceAmount=applianceAmount;
		
				
	}
}
