package com.twu.biblioteca.view;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MovieList {

    private List<Movie> movieList;

    public MovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<String> nameList() {
        return movieList.stream().map(Movie::getName).collect(toList());
    }

    public List<String> namePlusIsAvailableList() {
        List<String> namePlusIsAvailableList = new ArrayList<>();

        for(final Movie movie: movieList){
            final String formattedTitlePlusIsAvailable = String.format("%s - %s", movie.getName(), isAvailableToString(movie));
            namePlusIsAvailableList.add(formattedTitlePlusIsAvailable);
        }

        return namePlusIsAvailableList;
    }

    private String isAvailableToString(final Movie movie){
        return (movie.isAvailable() ? StringConstants.PRODUCT_IS_AVAILABLE : StringConstants.PRODUCT_IS_NOT_AVAILABLE);
    }
}
