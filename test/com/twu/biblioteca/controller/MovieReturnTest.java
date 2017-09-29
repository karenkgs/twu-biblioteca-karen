package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import java.time.Year;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieReturnTest {
    @Test
    public void testMovieReturn(){

        final MovieReturn movieReturn = new MovieReturn();
        final Movie movieToReturn = new Movie("", Year.now(), "", 0, false);

        Movie returnedMovie = movieReturn.returnMovie(movieToReturn);
        assertThat(returnedMovie.isAvailable(), equalTo(true));

        returnedMovie = movieReturn.returnMovie(movieToReturn);
        assertThat(returnedMovie, equalTo(null));

    }
}
