package oop.labor02.lab2_extra;

public class Movie {
    private String director;
    private String title;
    private double rating;
    private Genre genre;
    private int releaseYear;
    public Movie(String director, String title, double rating, Genre genre, int releaseYear) {
        this.director = director;
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
    public String getDirector() {
        return director;
    }
    public String getTitle() {
        return title;
    }
    public double getRating() {
        return rating;
    }
    public Genre getGenre() {
        return genre;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String toString() {
        return title + " (" + releaseYear + ") directed by " + director + ", rating: " + rating + ", genre: " + genre;
    }
}
