package com.twu.biblioteca.view;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.factory.RentableFactory;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RentableListTest {

    @Test
    public void testRentableBookList() {
        final RentableList bookList = new RentableList(RentableFactory.books());

        assertThat(bookList.titleList().get(0), equalTo("TDD By Example"));
        assertThat(bookList.titlePlusIsAvailableList().get(0), equalTo(String.format("TDD By Example - %s", StringConstants.RENTABLE_IS_AVAILABLE)));
    }

    @Test
    public void testRentableMovieList() {
        final RentableList movieList = new RentableList(RentableFactory.movies());

        assertThat(movieList.titleList().get(0), equalTo("Les Miserables"));
        assertThat(movieList.titlePlusIsAvailableList().get(0), equalTo(String.format("Les Miserables - %s", StringConstants.RENTABLE_IS_AVAILABLE)));
    }

}
