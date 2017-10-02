package com.twu.biblioteca.view;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.factory.RentableFactory;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieListTest {
    @Test
    public void testMovieList() {
        final MovieList movieList = new MovieList(RentableFactory.movies());

        assertThat(movieList.nameList().get(0), equalTo("Les Miserables"));
        assertThat(movieList.namePlusIsAvailableList().get(0), equalTo(String.format("Les Miserables - %s", StringConstants.PRODUCT_IS_AVAILABLE)));
    }
}
