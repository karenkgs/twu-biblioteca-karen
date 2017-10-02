package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsoleReader;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuControllerTest {

    private final MainMenuController mainMenuController = new MainMenuController(new ConsoleReader(), new RentableCheckout(), new RentableReturn(), new BookRepository(), new MovieRepository());

    private boolean isActionExecuted = false;

    private MainMenuOption selectedMainMenuOption;

    @Test
    public void testInvalidMenuOption(){
        selectedMainMenuOption = mainMenuController.selectedOption(999);
        assertThat(selectedMainMenuOption, equalTo(null));
//        verify();
    }

    @Test
    public void testValidMenuOption(){
        selectedMainMenuOption = mainMenuController.selectedOption(1);
        assertThat(selectedMainMenuOption, equalTo(MainMenuOption.LIST_BOOKS));
    }

    @Test
    public void testQuitMenuOption(){
        selectedMainMenuOption = mainMenuController.selectedOption(0);
        isActionExecuted = mainMenuController.executeActionForOption(selectedMainMenuOption);

        assertThat(isActionExecuted, equalTo(true));
    }

    @Test
    public void testListMenuOption(){
        selectedMainMenuOption = mainMenuController.selectedOption(1);
        isActionExecuted = mainMenuController.executeActionForOption(selectedMainMenuOption);

        assertThat(isActionExecuted, equalTo(true));
    }

//    @Test
//    public void testDetailMenuOption(){
//        selectedMainMenuOption = mainMenuController.selectedOption(4);
//        isActionExecuted = mainMenuController.executeActionForOption(selectedMainMenuOption);
//
//        assertThat(isActionExecuted, equalTo(true));
//    }

//    @Test
//    public void testCheckoutMenuOption(){
//        selectedMainMenuOption = mainMenuController.selectedOption(2);
//        isActionExecuted = mainMenuController.executeActionForOption(selectedMainMenuOption);
//
//        assertThat(isActionExecuted, equalTo(true));
//    }

}
