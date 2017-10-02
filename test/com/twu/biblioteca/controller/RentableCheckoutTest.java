package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Rentable;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import org.junit.Test;

import java.time.Year;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RentableCheckoutTest {

    BookRepository bookRepository = new BookRepository();
    MovieRepository movieRepository = new MovieRepository();

    @Test
    public void testRentableBookCheckout(){

        Rentable rentableBook = new Book("", true, "", Year.now());


        RentableCheckout rentableCheckout = new RentableCheckout();
        Book checkedOutBook = (Book)rentableCheckout.checkoutRentable(rentableBook);

        assertThat(checkedOutBook.isAvailable(), equalTo(false));

    }

    @Test
    public void testRentableMovieCheckout(){

        Rentable rentableMovie = new Movie("", Year.now(), "", 10, true);

        RentableCheckout rentableCheckout = new RentableCheckout();
        Movie checkedOutMovie = (Movie)rentableCheckout.checkoutRentable(rentableMovie);

        assertThat(checkedOutMovie.isAvailable(), equalTo(false));

    }

}
