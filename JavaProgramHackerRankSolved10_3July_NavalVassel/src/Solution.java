import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NavelVessel nv[]=new NavelVessel[2];
		for(int i=0;i<nv.length;i++) {
			System.out.println("Enter VesselId");
			int vesselId=sc.nextInt();
			System.out.println("VesselName");
			sc.nextLine();
			String vesselName=sc.nextLine();
			System.out.println("Enter No Of Voyeges Planned");
			int noOfVoyegesPlanned=sc.nextInt();
			System.out.println("No of Voyeges Compleated");
			int noOfVoyegesCompleated=sc.nextInt();
			System.out.println("Enter Purpose");
			sc.nextLine();
			String purpose=sc.nextLine();
			
			nv[i]=new NavelVessel(vesselId, vesselName, noOfVoyegesPlanned, noOfVoyegesCompleated, purpose);
		}
		System.out.println("FindAvgVoy");
		System.out.println("Enter Percentage");
		int per=sc.nextInt();
		int favbp=findAvgVoyegesByPct(nv, per);
		if(favbp!=0) {
		System.out.println("Average vessel  "+favbp);
		}else {
			System.out.println("Ther is no Voyeges is Compleated with this percentage");
		}
		System.out.println("FindVessalByGrade");
		System.out.println("Enter Purpose");
		sc.nextLine();
		String pr=sc.nextLine();
		NavelVessel nz=findVesselByGrade(pr, nv);
		if(nz!=null) {
			System.out.println(nz.getVesselName()+"%"+nz.getClassification());
		}else {
			System.out.println("No Navesal found with the specified purpose");
		}
	}
	
	public static int findAvgVoyegesByPct(NavelVessel nv[],int per )
	{
		int avg=0;
		int prg=0;
		int count=0;
		int total=0;
		for(int i=0;i<nv.length;i++) 
		{
			prg=(nv[i].getNoOfVoyegesCompleated()*100)/nv[i].getNoOfVoyegesPlanned();
			if(prg>= per) {
				total=total+nv[i].getNoOfVoyegesCompleated();
				count++;
			}
		}
		if(count!=0) {
			avg=total/count;
		}
		
		return avg;
	}
	
	
	public static NavelVessel  findVesselByGrade(String purpose,NavelVessel nv[]) {
		NavelVessel nz=null;
		int prg=0;
		for(int i=0;i<nv.length;i++) 
		{
			prg=(nv[i].getNoOfVoyegesCompleated()*100)/nv[i].getNoOfVoyegesPlanned();
			if(prg==100) {
				nv[i].setClassification("Star");
			}else if(prg<99&&prg>80) {
				nv[i].setClassification("Leader");
			}else if(prg<79&&prg>55) {
				nv[i].setClassification("Inspirer");
			}else {
				nv[i].setClassification("Striver");
			}
		}
		for(int i=0;i<nv.length;i++) 
		{
			if(nv[i].getPurpose().equalsIgnoreCase(purpose)) {
				nz=nv[i];
			}
		}
		
		return nz;
	}
	
	
}
