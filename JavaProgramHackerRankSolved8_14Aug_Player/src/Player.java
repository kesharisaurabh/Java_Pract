
public class Player 
{
	int playerId;
	String playerName;
	int score1;
	int score2;
	int score3; 	
	
	public void setPlayerId(int playerId) {
		this.playerId=playerId;
	}
	public void setPlayerName(String playerName) {
		this.playerName=playerName;
	}
	public void setScore1(int score1) {
		this.score1=score1;
	}
	public void setScore2(int score2) {
		this.score2=score2;
	}
	public void setScore3(int score3) {
		this.score3=score3;
	}
	public int getPlayerId() {
		return playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
	public int getScore3() {
		return score3;
	}
	public Player(int playerId, String playerName,int score1,int score2,int score3) {
		super();
		this.playerId=playerId;
		this.playerName=playerName;
		this.score1=score1;
		this.score2=score2;
		this.score3=score3;
	}
}
