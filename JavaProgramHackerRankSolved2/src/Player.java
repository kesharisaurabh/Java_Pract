
public class Player {
int playerId;
String playerName;
int score1;
int score2;
int score3;
public Player(int playerId, String playerName, int score1, int score2, int score3) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.score1 = score1;
	this.score2 = score2;
	this.score3 = score3;
}
int getPlayerId() {
	return playerId;
}
void setPlayerId(int playerId) {
	this.playerId = playerId;
}
String getPlayerName() {
	return playerName;
}
void setPlayerName(String playerName) {
	this.playerName = playerName;
}
int getScore1() {
	return score1;
}
void setScore1(int score1) {
	this.score1 = score1;
}
int getScore2() {
	return score2;
}
void setScore2(int score2) {
	this.score2 = score2;
}
int getScore3() {
	return score3;
}
void setScore3(int score3) {
	this.score3 = score3;
}

}
