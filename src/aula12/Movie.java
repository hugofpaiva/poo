package aula12;

public class Movie {
	private String name, score, rating, genre, time;

	public Movie(String name, String score, String rating, String genre, String time) {
		this.name = name;
		this.score = score;
		this.rating = rating;
		this.genre = genre;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return Double.parseDouble(score);
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getTime() {
		return Integer.parseInt(time);
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return String.format("%-40s%-10s%-12s%-15s%-12s",this.name,this.score,this.rating,this.genre,this.time);
	}
	
	
	
	
	

	
	

}
