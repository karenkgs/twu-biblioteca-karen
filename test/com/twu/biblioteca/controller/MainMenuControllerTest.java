package com.twu.biblioteca.controller;

import com.twu.biblioteca.repository.BookRepository;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuControllerTest {

    @Test
    public void testMenuOption(){
        BookCheckout bookCheckout = new BookCheckout(new BookRepository());
        boolean isCheckedOut = bookCheckout.checkoutByTitle("TDD By Example");

        assertThat(isCheckedOut, equalTo(true));
    }

}
