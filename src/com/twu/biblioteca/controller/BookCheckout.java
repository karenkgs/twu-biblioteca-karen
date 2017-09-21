package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

public class BookCheckout {

    public Book checkoutBook(Book bookToCheckout) {

        if(bookToCheckout != null && bookToCheckout.isAvailable()){
            bookToCheckout.setIsAvailable(false);
            return bookToCheckout;
        }

        return null;
    }
}
