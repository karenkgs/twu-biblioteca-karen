package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Rentable;
import org.junit.Test;

import java.time.Year;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class RentableReturnTest {


    RentableReturn rentableReturn = new RentableReturn();

    @Test
    public void testRentableBookReturn(){

        final Rentable rentableBook = new Book("", false, "", Year.now());

        Book returnedBook = (Book)rentableReturn.returnRentable(rentableBook);

        assertThat(returnedBook.isAvailable(), equalTo(true));

        returnedBook = (Book)rentableReturn.returnRentable(rentableBook);

        assertNull(returnedBook);

    }

    @Test
    public void testRentableMovieReturn(){

        final Rentable rentableMovie = new Movie("", Year.now(), "", 10, false);

        Movie returnedMovie = (Movie)rentableReturn.returnRentable(rentableMovie);

        assertThat(returnedMovie.isAvailable(), equalTo(true));

        returnedMovie = (Movie)rentableReturn.returnRentable(rentableMovie);

        assertNull(returnedMovie);

    }

}
