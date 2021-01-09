
/**
 * @author SAURABH KESHARI
 *
 */
public class Medicine 
{
	String medicineName;
	String batchNo;
	String disease;
	int price;
	
	public void setMedicineName(String medicineName){
		this.medicineName=medicineName;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo=batchNo;
	}
	public void setDisease(String disease) {
		this.disease=disease;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getMedicineName() {
		return medicineName;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public String getDisease() {
		return disease;
	}
	public int getPrice() {
		return price;
	}
	public Medicine(String medicineName,String batchNo,String disease,int price)
	{
		super();
		this.medicineName=medicineName;
		this.batchNo=batchNo;
		this.disease=disease;
		this.price=price;
	}
	
}