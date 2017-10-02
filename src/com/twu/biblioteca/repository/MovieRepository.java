package com.twu.biblioteca.repository;

import com.twu.biblioteca.factory.RentableFactory;
import com.twu.biblioteca.model.Movie;

import java.util.List;
import java.util.Optional;

public class MovieRepository {
    public static List<Movie> movieList;

    public MovieRepository(List<Movie> movieList){
        this.movieList = movieList;
    }

    public MovieRepository(){
        this(RentableFactory.movies());
    }

    public Movie searchMovieByName(final String name) {
        final Optional<Movie> movieWithName = movieList.stream()
                .filter(movie -> movie.getName().equals(name.trim()))
                .findAny();

        return movieWithName.orElse(null);
    }

    private List<Movie> moviesFromFactory() {
        return RentableFactory.movies();
    }

}
