package com.twu.biblioteca.repository;

import com.twu.biblioteca.factory.BookFactory;
import com.twu.biblioteca.model.Book;

import java.util.List;
import java.util.Optional;

public class BookRepository {

    final List<Book> bookList;

    public BookRepository(){
        this.bookList = booksFromFactory();
    }

    public Book searchBookByTitle(final String title) {
        final Optional<Book> bookWithTitle = bookList.stream()
                                                     .filter(book -> book.getTitle().equals(title.trim()))
                                                     .findAny();

        return bookWithTitle.orElse(null);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    private List<Book> booksFromFactory() {
        return BookFactory.books();
    }
}
