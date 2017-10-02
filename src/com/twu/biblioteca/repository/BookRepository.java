package com.twu.biblioteca.repository;

import com.twu.biblioteca.factory.RentableFactory;
import com.twu.biblioteca.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BookRepository {

    public static List<Book> bookList;

    public BookRepository(List<Book> bookList){
        this.bookList = bookList;
    }

    public BookRepository(){
        this(RentableFactory.books());
    }

    public Book searchBookByTitle(final String title) {
        final Optional<Book> bookWithTitle = bookList.stream()
                                                     .filter(book -> book.getTitle().equals(title.trim()))
                                                     .findAny();

        return bookWithTitle.orElse(null);
    }

    private List<Book> booksFromFactory() {
        return RentableFactory.books();
    }

    public Book searchBookByUUID(final UUID id) {
        final Optional<Book> bookWithID = bookList.stream()
                                                   .filter(book -> book.getId().equals(id))
                                                   .findAny();

        return bookWithID.orElse(null);
    }
}
