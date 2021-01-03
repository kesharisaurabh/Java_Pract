import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Player[] players=new Player[4];
		
		for(int i=0;i< players.length ;i++)
		{
			int playerId=sc.nextInt();
			sc.nextLine();
			String playerName=sc.nextLine();
			int score1=sc.nextInt();
			int score2=sc.nextInt();
			int score3=sc.nextInt();
			players[i]=new Player(playerId, playerName, score1, score2, score3);
		}
		
		int hundcount= findTotalHundredsCount(players);
		if(hundcount!=0)
		{
			System.out.println(hundcount);
		}else {
			System.out.println("No Hundreds Scored in Tournament");
		}
		
		Player p1=getTopPlayer(players);
		if(p1!=null)
		{
			System.out.println(p1.getPlayerId()+"#"+p1.getPlayerName());
		}
			
	}
	public static int findTotalHundredsCount(Player[] players)
	  {
	   int score=0;
	   for(Player p:players)
	   {
		   if(p.getScore1()>100)
		   {
			   score++;
		   }
		   if(p.getScore2()>100)
		   {
			   score++;
		   }
		   if(p.getScore3()>100)
		   {
			   score++;
		   }
	   }
	   
	   return score;
	  }

	public static Player getTopPlayer(Player[] players)
	  {
		
		Player py=null;
		int max=0;
		for(Player p:players)
		{
			if((p.getScore1()+p.getScore2()+p.getScore3())>max)
				{
					max=p.getScore1()+p.getScore2()+p.getScore3();	
				}			
		}
		for(Player p:players)
		{
			if((p.getScore1()+p.getScore2()+p.getScore3())==max)
				{					
					return p;
				}			
		}
		return py;		
	  }
}
