package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BookTest {

    @Test
    public void testIsAvailable(){
        Book book = new Book("", false);
        assertThat(book.isAvailable(), equalTo(false));
    }

}
