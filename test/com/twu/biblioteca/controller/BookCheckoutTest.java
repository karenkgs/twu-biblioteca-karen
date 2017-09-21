package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import org.junit.Test;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookCheckoutTest {

    @Test
    public void testBookCheckout(){

        final BookCheckout bookCheckout = new BookCheckout();
        final Book bookToCheckout = new Book("My Book", true);

        Book checkedOutBook = bookCheckout.checkoutBook(bookToCheckout);
        assertThat(checkedOutBook.isAvailable(), equalTo(false));

        checkedOutBook = bookCheckout.checkoutBook(bookToCheckout);
        assertThat(checkedOutBook, equalTo(null));

    }

}
