package Lessons23;

import java.util.HashSet;

public class TestMoviesCatalog {
    public static void main(String[] args) {
    MovieCatalog movieCatalog =  new MovieCatalog();

    movieCatalog.addMovie(new Movie("Терминатор","Боевик, Фантастика",2001));
    movieCatalog.addMovie(new Movie("Терминатор","Боевик, Фантастика",2001));
    movieCatalog.addMovie(new Movie("Хоббит","Фентези",2020));
    movieCatalog.addMovie(new Movie("Дракула","Фентези",2000));

    HashSet<Movie> resultFilterByGenre =  movieCatalog.filterMoviesByGenreSmall("Фентези");
    System.out.println("-------");
    resultFilterByGenre.forEach(System.out::println);
    System.out.println("-------");

    movieCatalog.printFilmInfo();
    movieCatalog.deleteMovie(new Movie("Дракула","Фентези",2000));
    movieCatalog.printFilmInfo();
}
}

/**Задача**: Создать программу для управления каталогом фильмов
в кинотеатре. Каждый фильм в каталоге должен быть
уникальным и характеризоваться названием, годом выпуска и жанром.
Необходимо реализовать возможность добавления фильмов в каталог,
исключая возможность добавления дубликатов,
и предоставить функцию вывода всего каталога фильмов.
*/