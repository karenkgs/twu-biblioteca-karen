package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

public class BookReturn {

    public Book returnBook(Book bookToReturn) {

        if(bookToReturn != null && !bookToReturn.isAvailable()){
            bookToReturn.setIsAvailable(true);
            return bookToReturn;
        }

        return null;
    }

}
