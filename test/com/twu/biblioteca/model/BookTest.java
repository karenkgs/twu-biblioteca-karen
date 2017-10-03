package com.twu.biblioteca.model;

import org.junit.Test;

import java.time.Year;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BookTest {

    @Test
    public void testIsAvailable() {
        final Book book = new Book("", false, "", Year.parse("2007"));
        assertThat(book.isAvailable(), equalTo(false));
    }

    @Test
    public void testBookToString() {
        final Book book = new Book("My Title", false, "Me", Year.parse("2017"));
        String expectedBookToString = String.format("Title: My Title%nAuthor: Me%nYear Published: 2017%nBorrowed");

        assertThat(book.toString(), equalTo(expectedBookToString));
    }

}
