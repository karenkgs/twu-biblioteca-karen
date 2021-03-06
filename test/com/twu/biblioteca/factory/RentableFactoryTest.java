package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.interfaces.Rentable;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RentableFactoryTest {

    @Test
    public void testRentableBookFactory() {
        List<Rentable> bookList = RentableFactory.books();

        assertNotNull(bookList);
    }

    @Test
    public void testRentableMovieFactory() {
        List<Rentable> movieList = RentableFactory.movies();

        assertNotNull(movieList);
    }
}
