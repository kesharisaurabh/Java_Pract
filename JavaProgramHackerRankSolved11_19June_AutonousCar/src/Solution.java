import java.util.Scanner;

public class Solution 
{
	public static void main(String []args)
	{
		AutonomousCar ac[]=new AutonomousCar[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ac.length;i++) {
			System.out.println("Enter CarId");
			int carId=sc.nextInt();
			System.out.println("Enter Car Brand");
			sc.nextLine();
			String brand=sc.nextLine();
			System.out.println("Enter No of Tests Conducted");
			int noOfTestsConducted=sc.nextInt();
			System.out.println("Enter No of tests Passed");
			int noOfTestsPassed=sc.nextInt();
			System.out.println("Enter Environment");
			sc.nextLine();
			String environment=sc.nextLine();
			
			ac[i]=new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
			
		}
		System.out.println("First Test PassesdByEnv");
		System.out.println("Enter Environment ");
		
		String env=sc.nextLine();
		int ftpbe=findTestPassedByEnv(ac, env);
		if(ftpbe!=0) {
			System.out.println(ftpbe);
		}else {
			System.out.println("There are no Tests Passed in this particular Env");
		}
		System.out.println("Update Car Grade");
		System.out.println("Enter Brande Name");
		
		String brand=sc.nextLine();
		AutonomousCar aw=updateCarGrade(brand, ac);
		if(aw!=null) {
			System.out.println(aw.getBrand()+"::"+aw.getGrade());
		}else {
			System.out.println("No Car is available with Specified brand ");
		}
	}
	
	public static int findTestPassedByEnv(AutonomousCar ac[], String env) {
		int count=0;
		for(int i=0;i<ac.length;i++) {
			if(ac[i].getEnvironment().equalsIgnoreCase(env)) {
				count++;
			}
		}
		return count;
	}
	public static AutonomousCar updateCarGrade(String brand, AutonomousCar ac[]) {
		AutonomousCar aq=null;
		int rating=0;
		for(int i=0;i<ac.length;i++) {
			rating=(ac[i].getNoOfTestsPassed()*100)/ac[i].getNoOfTestsConducted();
			
			if(rating>=80) {
				ac[i].setGrade("A1");
			}else {
				ac[i].setGrade("B2");
			}
		}
		
		for(int i=0;i<ac.length;i++) {
			if(ac[i].getBrand().equalsIgnoreCase(brand)) {
				aq=ac[i];
			}
		}
		
		return aq;
	}
	
}
