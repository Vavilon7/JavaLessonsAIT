package Lessons23;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieCatalog {
    private static HashSet<Movie> catalog;

    public MovieCatalog() {
        catalog = new HashSet<>();
    }

    public void addMovie(Movie movie) {
        if (movie == null) {
            System.out.println("Movie is null");
        } else {
            boolean addResult = catalog.add(movie);
            if (addResult) {
                System.out.println("Movie " + movie.getFilmName() + " was added in catalog");
            } else {
                System.out.println("Movie " + movie.getFilmName() + " has been already added in catalog !!!!");
            }
        }
    }

    public void deleteMovie(Movie movie) {
        if (movie == null) {
            System.out.println("Movie is null");
        } else {
            boolean removeResult = catalog.remove(movie);
            if (removeResult) {
                System.out.println("Movie " + movie.getFilmName() + " was removed in catalog");
            } else {
                System.out.println("Movie " + movie.getFilmName() + " was not removed in catalog, was not found");
            }
        }
    }

    public void printFilmInfo() {
        if (!catalog.isEmpty()) {
            for (Movie film : catalog) {
                System.out.println(film.toString());
            }
        } else {
            System.out.println("Catalog is empty!");
        }
    }

    public HashSet<Movie> filterMoviesByGenre(String filmGenre) {
        HashSet<Movie> filteredFilms = new HashSet<>();
        if (catalog.isEmpty()) {
            System.out.println("Movie hashSet is empty");
        } else {
            for (Movie film : catalog) {
                if (film.getFilmGenre().equalsIgnoreCase(filmGenre)) {
                    filteredFilms.add(film);
                }
            }
            if (filteredFilms.isEmpty()) {
                System.out.println("No films was found!");
            }
        }
        return filteredFilms;
    }

    public HashSet<Movie> filterMoviesByGenreSmall(String filmGenre) {
        Set<Movie> foundMoviesByGenre = catalog.stream().filter(
                movie -> movie.getFilmGenre().equalsIgnoreCase(filmGenre)).collect(Collectors.toSet());
        return (HashSet<Movie>) foundMoviesByGenre;
    }

    public HashSet<Movie> getCatalog() {
        return catalog;
    }
}

