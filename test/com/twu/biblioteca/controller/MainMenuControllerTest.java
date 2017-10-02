package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class MainMenuControllerTest {

    private final MainMenuController mainMenuController = new MainMenuController(new ConsoleReader(), new ConsolePrinter(),
                                                                                 new RentableCheckout(), new RentableReturn(),
                                                                                 new BookRepository(), new MovieRepository());

    private MainMenuOption selectedMainMenuOption;

    @Test
    public void testInvalidMenuOption(){
        selectedMainMenuOption = mainMenuController.selectedOption(999);
        assertNull(selectedMainMenuOption);
//        verify();
    }

    @Test
    public void testValidMenuOption(){
        selectedMainMenuOption = mainMenuController.selectedOption(1);
        assertThat(selectedMainMenuOption, equalTo(MainMenuOption.LIST_BOOKS));
    }


}
