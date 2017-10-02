package com.twu.biblioteca.model;

import org.junit.Test;

import java.time.Year;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MovieTest {


    @Test
    public void testMovieToString(){
        final Movie movie = new Movie("My Movie", Year.parse("2007"), "Me", 10, true);
        final String expectedMovieToString = String.format("Name: My Movie%nDirector: Me%nYear: 2007%nRating: 10%nNot Borrowed%n");

        assertThat(movie.toString(), equalTo(expectedMovieToString));
    }

}
