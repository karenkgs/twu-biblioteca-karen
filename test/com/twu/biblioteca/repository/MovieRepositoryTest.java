package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Rentable;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieRepositoryTest {

    @Test
    public void testMoviePersistency(){
        final List<Rentable> movies = MovieRepository.movieList;

        assertThat(movies.get(0).getTitle(), equalTo("Les Miserables"));
    }

    @Test
    public void testSearchByName(){

        final MovieRepository movieRepository = new MovieRepository();
        assertThat(movieRepository.searchMovieByName("Les Miserables").getTitle(), equalTo("Les Miserables"));

        assertThat(movieRepository.searchMovieByName(""), equalTo(null));
        assertThat(movieRepository.searchMovieByName("Not Existing Name"), equalTo(null));

    }
    
}
