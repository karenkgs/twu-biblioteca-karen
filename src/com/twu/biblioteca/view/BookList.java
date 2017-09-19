package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;

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
}
