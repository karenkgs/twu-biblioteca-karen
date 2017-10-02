package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RentableFactoryTest {

    @Test
    public void testRentableBookFactory(){
        List<Book> bookList = RentableFactory.books();

        assertNotNull(bookList);
    }

    @Test
    public void testRentableMovieFactory(){
        List<Movie> movieList = RentableFactory.movies();

        assertNotNull(movieList);
    }
}
