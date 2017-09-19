package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookFactoryTest {

    @Test
    public void testBookList(){
        List<Book> books = BookFactory.books();

        assertThat(books.get(0).getTitle(), equalTo("TDD By Example"));
    }
}
