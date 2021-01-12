import java.util.Scanner;

public class Solution 
{
	public static void main(String []args) {
		Player ply[]=new Player[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ply.length;i++) 
		{	
			System.out.println("Enater PlayerID");
			int playerId=sc.nextInt();
			System.out.println("Enter PlayerName");
			sc.nextLine();
			String playerName=sc.nextLine();
			System.out.println("Enter Score1");
			int score1=sc.nextInt();
			System.out.println("Enetr Score2");
			int score2=sc.nextInt();
			System.out.println("Enetr Score3");
			int score3=sc.nextInt();
			ply[i]=new Player(playerId, playerName, score1, score2, score3);
			
		}
		int hundScore=findTotalHundredCount(ply);
		if(hundScore!=0) {
			System.out.println(hundScore);
		}else {
			System.out.println("No Hundreds Scored in Tournament");
		}	
		Player pw=getTopPlayer(ply);
		if(pw!=null) {
			System.out.println(pw.getPlayerId()+"#"+pw.getPlayerName());
		}else {
			System.out.println("There where no Playe ERRRoRR");
		}
				
	}
	public static int findTotalHundredCount(Player plq[]) {
		
		int count=0;
			for(int i=0;i<plq.length;i++)
			{
				if(plq[i].getScore1()>99) {
					count++;
				}
				if(plq[i].getScore2()>99) {
					count++;
				}
				if(plq[i].getScore3()>99) {
					count++;
				}
			}
		return count;
	}
	public static Player getTopPlayer(Player plq[])
	{
		Player plw=null;
		int pid=0;
		int max=0;
		for(int i=0;i<plq.length;i++) {
			
			if(plq[i].getScore1()+plq[i].getScore2()+plq[i].getScore3()>max) 
			{
				max=plq[i].getScore1()+plq[i].getScore2()+plq[i].getScore3();
				pid=i;
			}
		}
		plw=plq[pid];
		return plw;
	}
	
}
