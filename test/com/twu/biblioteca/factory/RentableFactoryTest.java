package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Rentable;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RentableFactoryTest {

    @Test
    public void testRentableBookFactory(){
        List<Rentable> bookList = RentableFactory.books();

        assertNotNull(bookList);
    }

    @Test
    public void testRentableMovieFactory(){
        List<Rentable> movieList = RentableFactory.movies();

        assertNotNull(movieList);
    }
}
