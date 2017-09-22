package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookFactory {

    public static List<Book> books() {
        final List<Book> books = new ArrayList<>(Arrays.asList(new Book("TDD By Example", true, "Kent Beck", Year.parse("2002")),
                                                               new Book("Head First Java", true, "Bert Bates and Kathy Sierra", Year.parse("2003"))));

        return books;
    }
}
