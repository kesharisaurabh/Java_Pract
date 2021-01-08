import java.util.Scanner;

public class Solution 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		Appliance ac[]=new Appliance[4];
		for(int i=0;i<ac.length;i++)
		{
			
			System.out.println("enter Id");
			int applianceId=sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name");
			String applianceName=sc.next();
			
			System.out.println("Enter Category");
			String applianceCategory=sc.next();
			
			System.out.println("Enter Amount");
			double applianceAmount=sc.nextDouble();
			
			
			ac[i]=new Appliance(applianceId,applianceName,applianceCategory,applianceAmount);
			
		}
		System.out.println("search 1");
		System.out.println("Enter ApplianceId");
		int id1=sc.nextInt();
		System.out.println("Enter Insurance");
		boolean bval1=sc.nextBoolean();
		
		double ApplianceAmt=getApplianceAmount(ac, id1, bval1);
		if(ApplianceAmt!=0)
		{
			System.out.println(ApplianceAmt+" is Appliance Amount with Insurance");
		}
		System.out.println("Search 2 Costliest Category");
		sc.nextLine();
		String apc=sc.next();
		Appliance apz=getCostliestAppliance(ac, apc);
		
		System.out.println(apz.getApplianceId()+" "+apz.getApplianceName()+" "+apz.getApplianceCategory()+" "+apz.getApplianceAmount()+" "+apz.getInsurance() );
		
	}
	
	public static double getApplianceAmount(Appliance []app,int applianceId,boolean insurance)
	{
		double amt=0;
		
		for(int i=0;i<app.length;i++) 
		{
			if(app[i].getApplianceId()==applianceId&& insurance)
			{
				amt=app[i].getApplianceAmount()+((app[i].getApplianceAmount() *20)/100);
				app[i].setApplianceAmount(amt);
				
				
			}
		}		
		return amt;
	}
	public static Appliance getCostliestAppliance(Appliance app[], String applianceCategory)
	{
		Appliance aq=null;
		double max=0;
		int val=0;
		for(int i=0;i<app.length;i++)
		{
			if(app[i].getApplianceCategory().equalsIgnoreCase(applianceCategory)&& app[i].getApplianceAmount() > max)
			{
					max = app[i].getApplianceAmount();
					val = i;
			
			}
		}
		aq=app[val];
		return aq;
	}
	
	
	
}
