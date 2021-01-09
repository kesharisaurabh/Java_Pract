import java.util.Arrays;
import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Medicine[] medicine=new Medicine[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<medicine.length;i++)
		{
			System.out.println("Enter MedineName");
			String medicineName=sc.nextLine();
			System.out.println("Enter batchNo");
			String batchNo=sc.nextLine();
			System.out.println("Enter Disease");
			String disease=sc.nextLine();
			System.out.println("inter Price");
			int price=sc.nextInt();
			sc.nextLine();
			medicine[i]=new Medicine(medicineName,batchNo,disease,price);
			
		}
		System.out.println("Enter Disease For total money ");
		System.out.println("Enter Disease ");
	
		String search=sc.nextLine();
		int[] price=medicinePriceForGivenDisease(medicine,search);
		System.out.println("Prices of medicines are ");
		for(int j=0;j<price.length;j++)
		{
			System.out.println(price[j]);
		}
	}

	private static int[] medicinePriceForGivenDisease(Medicine[] medi, String disease)  {
		
		
		int k=0;
		
		for(int i=0;i<medi.length;i++)
		{
			
			if(medi[i].getDisease().equalsIgnoreCase(disease))
			{
				k++;
			}
			
		}
		int pricek[]=new int[k];
		int q=0;
		for(int i=0;i<medi.length;i++)
		{
			
			if(medi[i].getDisease().equalsIgnoreCase(disease))
			{
				System.out.println(medi[i].getPrice());
				pricek[q]=medi[i].getPrice();
				q++;
			}
		}
		
		
		return pricek;
	}
	
}
