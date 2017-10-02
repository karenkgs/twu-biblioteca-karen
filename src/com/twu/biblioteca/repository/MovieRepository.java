package com.twu.biblioteca.repository;

import com.twu.biblioteca.factory.RentableFactory;
import com.twu.biblioteca.model.Rentable;

import java.util.List;
import java.util.Optional;

public class MovieRepository {
    public static List<Rentable> movieList;

    public MovieRepository(List<Rentable> movieList){
        this.movieList = movieList;
    }

    public MovieRepository(){
        this(RentableFactory.movies());
    }

    public Rentable searchMovieByName(final String name) {
        final Optional<Rentable> movieWithName = movieList.stream()
                .filter(movie -> movie.getTitle().equals(name.trim()))
                .findAny();

        return movieWithName.orElse(null);
    }

}
