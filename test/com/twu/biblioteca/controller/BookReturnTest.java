package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookReturnTest {
    @Test
    public void testBookReturn(){
        final BookReturn bookReturn = new BookReturn();
        final Book bookToReturn = new Book("My Book", false);

        Book returnedBook = bookReturn.returnBook(bookToReturn);
        assertThat(returnedBook.isAvailable(), equalTo(true));

        returnedBook = bookReturn.returnBook(bookToReturn);
        assertThat(returnedBook, equalTo(null));

    }
}
