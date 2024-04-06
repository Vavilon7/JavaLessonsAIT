package Lessons23;

import java.util.Objects;

public class Movie {
    private String filmName;
    private String filmGenre;
    private int yearOfIssue;

    public Movie(String filmName, String filmGenre, int yearOfIssue) {
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.yearOfIssue = yearOfIssue;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return yearOfIssue == movie.yearOfIssue && Objects.equals(filmName, movie.filmName) && Objects.equals(filmGenre, movie.filmGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmName, filmGenre, yearOfIssue);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "filmName='" + filmName + '\'' +
                ", filmGenre='" + filmGenre + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}


