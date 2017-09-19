package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

public class BookCheckout {

    private BookRepository bookRepository;

    public BookCheckout(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public boolean checkoutByTitle(String title) {
        Book bookToCheckout = bookRepository.searchBookByTitle(title);

        if(bookToCheckout != null && bookToCheckout.isAvailable()){
            bookToCheckout.setIsAvailable(false);
            this.bookRepository = new BookRepository();
            return true;
        }
        return false;
    }
}
