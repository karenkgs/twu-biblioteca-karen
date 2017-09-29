package com.twu.biblioteca.view;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BookList {
    final private List<Book> bookList;

    public BookList(final List<Book> bookList){
        this.bookList = bookList;
    }

    public List<String> titleList() {
        return bookList.stream().map(Book::getTitle).collect(toList());
    }

    public List<String> titlePlusIsAvailableList() {

        List<String> titlePlusIsAvailableList = new ArrayList<>();

        for(final Book book: bookList){
            final String formattedTitlePlusIsAvailable = String.format("%s - %s", book.getTitle(), isAvailableToString(book));
            titlePlusIsAvailableList.add(formattedTitlePlusIsAvailable);
        }

        return titlePlusIsAvailableList;
    }

    private String isAvailableToString(final Book book){
        return (book.isAvailable() ? StringConstants.PRODUCT_IS_AVAILABLE : StringConstants.PRODUCT_IS_NOT_AVAILABLE);
    }
}
