import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		movie mv[]=new movie[1];
		for(int i=0;i<mv.length;i++) {
			System.out.println("Enter MovieId");
			int movieId=sc.nextInt();
			System.out.println("Enter Director Name");
			sc.nextLine();
			String director=sc.nextLine();
			System.out.println("Enter rating");
			int rating=sc.nextInt();
			System.out.println("Enter budget");
			int budget=sc.nextInt();
			
			mv[i]=new movie(movieId, director, rating, budget);
		}
		System.out.println("FindAvgMovieByDirector");
		System.out.println("Enter Director name to search");
		sc.nextLine();
		String dir=sc.nextLine();
		
		if(fingAvgBudgetByDirector(mv, dir)!=0) {
			System.out.println(fingAvgBudgetByDirector(mv, dir));
		}else {
			System.out.println("Soory the given director has not yet directed any Movie");
		}
		
		System.out.println("GetMovieBy RatingBudget");
		System.out.println("Enter Rating");
		int rat=sc.nextInt();
		System.out.println("Enter budget");
		int budg=sc.nextInt();
		movie mq=getMovieByRatingBudget(mv, rat, budg);
		if(mq!=null) {
			System.out.println(mq.getMovieId());
		}else {
			System.out.println("No movie is avaliable of ur req");
		}
		
	}
	
	public static int fingAvgBudgetByDirector(movie mv[],String dir) {

		int count=0;
		int total=0;
		int avg=0;
		for(int i=0;i<mv.length;i++) {
			if(mv[i].getDirector().equalsIgnoreCase(dir)) {
				total=total+mv[i].getBudget();
				count++;
			}
		}
		if(count!=0) {
		avg=total/count;}
		return avg;
	}
	public static movie getMovieByRatingBudget(movie mv[],int rating,int budget) {
		movie mk=null;
		
		for(int i=0;i<mv.length;i++) {
			if(mv[i].getBudget()==budget && mv[i].getRating()==rating && (mv[i].getBudget() % mv[i].getRating())==0) {
				mk=mv[i];
			}
			
		}
		return mk;
	}
}
