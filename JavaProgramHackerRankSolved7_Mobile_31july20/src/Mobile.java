
public class Mobile 
{
	String iMEICode;
	boolean isSingleSim;
	String processor;
	double price;
	String manufacturer;
	public void setIMEICode(String iMEICode){
		this.iMEICode=iMEICode;
	}
	public void setIsSingleSim(boolean isSingleSim) {
		this.isSingleSim=isSingleSim;
	}
	public void setProcessor(String processor) {
		this.processor=processor;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setManufacturing(String manufacturer) {
		this.manufacturer=manufacturer;
	}
	public String getIMEICode() {
		return iMEICode;
	}
	public boolean getIsSingleSim() {
		return isSingleSim;
	}
	public String getProcessor() {
		return processor;
	}
	public double getPrice() {
		return price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	public Mobile(String iMEICode,boolean isSingleSim, String processor,double price,String manufacturer) {
		super();
		this.iMEICode=iMEICode;
		this.isSingleSim=isSingleSim;
		this.processor=processor;
		this.price=price;
		this.manufacturer=manufacturer;
	}
}
