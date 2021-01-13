
public class NavelVessel 
{
	int vesselId;
	String vesselName;
	int noOfVoyegesPlanned;
	int noOfVoyegesCompleated;
	String purpose;
	String classification;
	
	int getVesselId() {
		return vesselId;
	}
	void setVesselId(int vesselId) {
		this.vesselId = vesselId;
	}
	String getVesselName() {
		return vesselName;
	}
	void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}
	int getNoOfVoyegesPlanned() {
		return noOfVoyegesPlanned;
	}
	void setNoOfVoyegesPlanned(int noOfVoyegesPlanned) {
		this.noOfVoyegesPlanned = noOfVoyegesPlanned;
	}
	int getNoOfVoyegesCompleated() {
		return noOfVoyegesCompleated;
	}
	void setNoOfVoyegesCompleated(int noOfVoyegesCompleated) {
		this.noOfVoyegesCompleated = noOfVoyegesCompleated;
	}
	String getPurpose() {
		return purpose;
	}
	void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	String getClassification() {
		return classification;
	}
	void setClassification(String classification) {
		this.classification = classification;
	}
	public NavelVessel(int vesselId, String vesselName, int noOfVoyegesPlanned, int noOfVoyegesCompleated,
			String purpose) {
		super();
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.noOfVoyegesPlanned = noOfVoyegesPlanned;
		this.noOfVoyegesCompleated = noOfVoyegesCompleated;
		this.purpose = purpose;
		
	}
	
	
}
