package com.twu.biblioteca.view;

import com.twu.biblioteca.factory.MovieFactory;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieListTest {
    @Test
    public void testMovieList() {
        final MovieList movieList = new MovieList(MovieFactory.movies());

        assertThat(movieList.nameList().get(0), equalTo("Les Miserables"));
        assertThat(movieList.namePlusIsAvailableList().get(0), equalTo("Les Miserables - Not Borrowed"));
    }
}
