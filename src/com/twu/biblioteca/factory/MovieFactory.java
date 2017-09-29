package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Movie;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class MovieFactory {

    public static List<Movie> movies() {
        return Arrays.asList(new Movie("Les Miserables", Year.parse("2007"), "Me", 10, true));
    }
}
