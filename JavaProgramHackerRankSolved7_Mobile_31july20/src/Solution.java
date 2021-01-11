import java.util.Scanner;

public class Solution 
{
	public static void main(String[]args) {
		Mobile mobile[]=new Mobile[1];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<mobile.length;i++) 
		{
			System.out.println("Enter IMEI");
			String iME=sc.nextLine();
			System.out.println("Enter IsSingleSim");
			boolean isSingleSim=sc.nextBoolean();
			System.out.println("Enetr Processor");
			sc.nextLine();
			String processor=sc.nextLine();
			System.out.println("Enter Price");
			double price=sc.nextDouble();
			System.out.println("Enter Manufacturer");
			sc.nextLine();
			String manuf=sc.nextLine();
			
			Mobile mtq=new Mobile(iME, isSingleSim, processor, price, manuf);
			mobile[i]=mtq;
		}
		System.out.println("Mobile with valid iMEICode");
		
		System.out.println(getCountOfValidImeimobile(mobile));
		System.out.println("Find Mobile With Max Price");
		System.out.println("Enetr Discount Percent");
		double disPer=sc.nextDouble();
		System.out.println("Manufacturer Name");
		sc.nextLine();
		String mnfName=sc.nextLine();
		
		Mobile mz=findMobileWithMaxPrice(mobile, disPer, mnfName);
		if(mz!=null) {
			System.out.println(mz.getIMEICode()+"@"+mz.getPrice());
		}else {
			System.out.println("No Mobile Found");
		}
	}

	public static int getCountOfValidImeimobile(Mobile mb[]) {
		int q=0;
			
		for(Mobile mv:mb)
		{
			System.out.println(mv.getIMEICode().toString().length());
			if(mv.getIMEICode().toString().length()==15)
			{
				q++;
			}
			
		}
		
		return q;
	}
	public static Mobile findMobileWithMaxPrice(Mobile mb[],double disPer,String mnfName)
	{
		Mobile mob=null;
			for(int i=0;i<mb.length;i++) {
				if(mb[i].getManufacturer().equalsIgnoreCase(mnfName) )
				{
					double k=(mb[i].getPrice()-(mb[i].getPrice()*disPer)/100);
					
					mb[i].setPrice(k);
					
				}
			}
			for(int i=0;i<mb.length;i++)
			{
				double z=0;
				int w=0;
				if(mb[i].getPrice()>=z)
				{
					z=mb[i].getPrice();
					w=i;
				}
				mob=mb[w];
			}
		return mob;
	}

}












