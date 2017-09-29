package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import java.time.Year;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieCheckoutTest {
    
    @Test
    public void testMovieCheckout(){

        final MovieCheckout movieCheckout = new MovieCheckout();
        final Movie movieToCheckout = new Movie("My Movie", Year.now(), "Me", 5, true);

        Movie checkedOutMovie = movieCheckout.checkoutMovie(movieToCheckout);
        assertThat(checkedOutMovie.isAvailable(), equalTo(false));

        checkedOutMovie = movieCheckout.checkoutMovie(movieToCheckout);
        assertThat(checkedOutMovie, equalTo(null));

    }
    
}
