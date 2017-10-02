package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Rentable;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class RentableFactory {

    public static List<Rentable> books() {
        return new ArrayList<>(Arrays.asList(new Book("TDD By Example", true, "Kent Beck", Year.parse("2002")),
                                             new Book("Head First Java", true, "Bert Bates and Kathy Sierra", Year.parse("2003")),
                                             new Book("Rails", true, "R. R.", Year.parse("2003")),
                                             new Book("Python", true, "P. P.", Year.parse("2004")),
                                             new Book("Dumplings", true, "D. D.", Year.parse("2005")),
                                             new Book("Agile", true, "A. A.", Year.parse("2006")),
                                             new Book("English Muffins", true, "E. M.", Year.parse("2007")),
                                             new Book("Coffee", true, "C. C.", Year.parse("2008"))));
    }

    public static List<Rentable> movies() {
        return Arrays.asList(new Movie("Les Miserables", Year.parse("2007"), "Me", 10, true),
                             new Movie("The Shining", Year.parse("2008"), "You", 9, true),
                             new Movie("Help!", Year.parse("2009"), "H.", 8, true),
                             new Movie("The WallStreet Wolf", Year.parse("2010"), "T. W. W.", 7, true),
                             new Movie("Fight Club", Year.parse("2011"), "F. C.", 6, true),
                             new Movie("How To Train Your Dragon", Year.parse("2012"), "H. T. T. Y. D.", 5, true),
                             new Movie("A Series Of Unfortunate Events", Year.parse("2013"), "A. S. O. U. E.", 4, true));
    }

}
