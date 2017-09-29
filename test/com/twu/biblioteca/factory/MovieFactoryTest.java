package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieFactoryTest {
    @Test
    public void testMovieList(){
        final List<Movie> movies = MovieFactory.movies();

        assertThat(movies.get(0).getName(), equalTo("Les Miserables"));
    }
}
