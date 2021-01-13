import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TravelAgencies ta[]=new TravelAgencies[2];
		
		for(int i=0;i<ta.length;i++) {
			System.out.println("Enter Reg NO");
			int regNo=sc.nextInt();
			System.out.println("Enter AgencyName");
			sc.nextLine();
			String angencyName=sc.nextLine();
			System.out.println("Enter Package Type");
			String packageType=sc.nextLine();
			System.out.println("Enter Price");
			int price=sc.nextInt();
			System.out.println("Enter Rating");
			int rating=sc.nextInt();
			System.out.println("Enter Location");
			sc.nextLine();
			String location=sc.nextLine();
			
			ta[i]=new TravelAgencies(regNo, angencyName, packageType, price, rating, location);
			
		}
		System.out.println("Find Agency With Highest PackagePrice");
		System.out.println("Enetr Loaction");
		
		String locString=sc.nextLine();
		int fawh=findAgencyWithHigestPackagePrice(ta, locString);
		if(fawh!=0) {
			System.out.println(fawh);
		}else {
			System.out.println("No Agency in the given Location");
		}
		System.out.println("Sorted Agency Detail By Package");
		System.out.println("Enter Package Type");
		String pkgType=sc.nextLine();
		TravelAgencies taw[]=sortedAgencyDetailByPck(ta, pkgType);
		
		if(taw!=null) {
			for(TravelAgencies tpp:taw) {
				System.out.println("Agency Name Sorted by Rating "+tpp.getAngencyName());
			}
		}else {
			System.out.println("No such agencies with thegiven packageType");
		}
		
	}
	
	public static int findAgencyWithHigestPackagePrice( TravelAgencies tq[],String locString)
	{
		int hig=0;
		for(int i=0;i<tq.length;i++) {
			if(tq[i].getLocation().equalsIgnoreCase(locString)&& tq[i].getPrice()>hig) {
				hig=tq[i].getPrice();
			}
		}
		return hig;
	}
	
	public static TravelAgencies[] sortedAgencyDetailByPck(TravelAgencies ta[],String pkgType) {
		int count=0;
		TravelAgencies tq[]=null;
		for(int i=0;i<ta.length;i++) {
			if(ta[i].getPackageType().equalsIgnoreCase(pkgType)) {
				count++;
			}
		}
		
		TravelAgencies ttemp=null;
		if(count!=0) {
			tq=new TravelAgencies[count];
		}
		int zz=0;
		for(TravelAgencies tt:ta) {
			if(tt.getPackageType().equalsIgnoreCase(pkgType)) {
				tq[zz]=tt;
			}
		}
		
		for(int i=0;i<tq.length;i++) {
			for(int j=i+1;j<tq.length;j++) {
				if(tq[i].getRating()>tq[j].getRating()) {
					ttemp=tq[i];
					tq[i]=tq[j];
					tq[j]=ttemp;
				}
			}
		}
		
		return tq;
	}
	
	
}
