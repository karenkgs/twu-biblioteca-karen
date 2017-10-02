package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RentableFactory {

    public static List<Book> books() {
        return new ArrayList<>(Arrays.asList(new Book("TDD By Example", true, "Kent Beck", Year.parse("2002")),
                new Book("Head First Java", true, "Bert Bates and Kathy Sierra", Year.parse("2003"))));
    }

    public static List<Movie> movies() {
        return Arrays.asList(new Movie("Les Miserables", Year.parse("2007"), "Me", 10, true));
    }

}
