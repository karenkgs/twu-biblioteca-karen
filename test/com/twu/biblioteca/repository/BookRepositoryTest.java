package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Book;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookRepositoryTest {

    @Test
    public void testBookPersistency(){
        BookRepository bookRepository = new BookRepository();
        List<Book> books = bookRepository.getBookList();

        assertThat(books.get(0).getTitle(), equalTo("TDD By Example"));
    }

    @Test
    public void testSearchByTitle(){

        final BookRepository bookRepository = new BookRepository();
        assertThat(bookRepository.searchBookByTitle("TDD By Example").getTitle(), equalTo("TDD By Example"));
        assertThat(bookRepository.searchBookByTitle("Head First Java").getTitle(), equalTo("Head First Java"));

        assertThat(bookRepository.searchBookByTitle(""), equalTo(null));
        assertThat(bookRepository.searchBookByTitle("Not Existing Title"), equalTo(null));

    }
}
