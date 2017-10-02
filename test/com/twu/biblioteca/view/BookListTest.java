package com.twu.biblioteca.view;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.factory.RentableFactory;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookListTest {

    @Test
    public void testBookList() {
        final BookList bookList = new BookList(RentableFactory.books());

        assertThat(bookList.titleList().get(0), equalTo("TDD By Example"));
        assertThat(bookList.titlePlusIsAvailableList().get(0), equalTo(String.format("TDD By Example - %s", StringConstants.PRODUCT_IS_AVAILABLE)));
    }

}
