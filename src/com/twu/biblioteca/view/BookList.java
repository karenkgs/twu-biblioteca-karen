package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList;

    public BookList(List<Book> bookList){
        this.bookList = bookList;
    }

    public List<String> titleList() {
        List<String> titleList = new ArrayList<>();

        for(Book book: bookList){
            titleList.add(book.getTitle());
        }

        return titleList;
    }
}
