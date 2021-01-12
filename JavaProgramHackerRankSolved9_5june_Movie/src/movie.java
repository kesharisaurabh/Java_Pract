
public class movie 
{
	int movieId;
	String director;
	int rating;
	int budget;
	
	public void setMoviedId(int movieId) {
		this.movieId=movieId;
	}
	public void setDirector(String director) {
		this.director=director;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public void setBudget(int budget) {
		this.budget=budget;
	}
	public int getMovieId() {
		return movieId;
	}
	public String getDirector() {
		return director;
	}
	public int getRating() {
		return rating;
	}
	public int getBudget() {
		return budget;
	}
	public movie(int movieId,String director,int rating,int budget) {
		super();
		this.movieId=movieId;
		this.director=director;
		this.rating=rating;
		this.budget=budget;
	}
}
