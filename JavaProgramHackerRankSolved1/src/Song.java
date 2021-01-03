
public class Song
{

	  int songId;
	  String title;
	  String artist;
	  int rating;
	int getSongId() {
		return songId;
	}
	void setSongId(int songId) {
		this.songId = songId;
	}
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getArtist() {
		return artist;
	}
	void setArtist(String artist) {
		this.artist = artist;
	}
	int getRating() {
		return rating;
	}
	void setRating(int rating) {
		this.rating = rating;
	}
	public Song(int songId, String title, String artist, int rating) {
		super();
		this.songId = songId;
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}
	  
	  
}
