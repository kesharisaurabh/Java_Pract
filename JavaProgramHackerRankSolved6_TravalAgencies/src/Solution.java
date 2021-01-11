import java.util.Scanner;

public class Solution 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TravelAgencies []ta=new TravelAgencies[4];
		for(int i=0;i<ta.length;i++)
		{
			System.out.println("RegNo");
			int regNo=sc.nextInt();
			System.out.println("AgencyName");
			sc.nextLine();
			String agencyName=sc.nextLine();
			System.out.println("PackageType");
			String packageType=sc.nextLine();
			System.out.println("price");
			int price=sc.nextInt();
			System.out.println("FlightFacility");
			boolean flightFacility=sc.nextBoolean();
			
			ta[i]=new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
			
			
		}
		int faw=FindAgencyWithHighestPackage(ta);
		System.out.println("Highest package"+faw);
		
		System.out.println("Agency Detail");
		System.out.println("Enter RegNo");
		int regN=sc.nextInt();
		System.out.println("Enter PackageType");
		sc.nextLine();
		String pt=sc.nextLine();
		TravelAgencies tq=AgencyDetailForGivenId(ta, regN, pt);
		if(tq!=null) {
			System.out.println(tq.getRegNo()+" "+tq.getAgencyName()+" "+tq.getPackageType()+" "+tq.getPrice());
		}else {
			System.out.println("No value found");
		}
		
		
	}
	public static int FindAgencyWithHighestPackage(TravelAgencies ta[] )
	{
		int q=0;
		for(int i=0;i<ta.length;i++) 
		{
			if(ta[i].getPrice()>=q)
			{
				q=ta[i].getPrice();
			}
		}
			
		
		return q;		
	}
	public static TravelAgencies AgencyDetailForGivenId(TravelAgencies ta[],int regN, String packageTy)
	{
		TravelAgencies tq=null;
		System.out.println("In");
		for(int i=0;i<ta.length;i++)
		{
			if(ta[i].getflightFacility()==true && ta[i].getRegNo()==regN  && packageTy.equalsIgnoreCase(ta[i].getPackageType()))
			{
				tq = ta[i];
			}
		}
		
		return tq;
	}
}
