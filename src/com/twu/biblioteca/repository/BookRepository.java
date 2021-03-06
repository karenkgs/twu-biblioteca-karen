package com.twu.biblioteca.repository;

import com.twu.biblioteca.factory.RentableFactory;
import com.twu.biblioteca.model.interfaces.Rentable;

import java.util.List;
import java.util.Optional;

public class BookRepository {

    public static List<Rentable> bookList;

    public BookRepository(List<Rentable> bookList) {
        this.bookList = bookList;
    }

    public BookRepository() {
        this(RentableFactory.books());
    }

    public Rentable searchBookByTitle(final String title) {
        final Optional<Rentable> bookWithTitle = bookList.stream()
                                                         .filter(book -> book.getTitle().equals(title.trim()))
                                                         .findAny();

        return bookWithTitle.orElse(null);
    }

}
