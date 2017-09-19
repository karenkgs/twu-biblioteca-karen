package com.twu.biblioteca.view;

import com.twu.biblioteca.factory.BookFactory;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookListTest {

    @Test
    public void testPrintedBookList() {
        final BookList bookList = new BookList(BookFactory.books());

        assertThat(bookList.titleList().get(0), equalTo("TDD By Example"));
    }

}
