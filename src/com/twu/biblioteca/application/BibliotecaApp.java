package com.twu.biblioteca.application;

import com.twu.biblioteca.controller.MainMenuController;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        List<MainMenuOption> mainMenuList = new ArrayList<>(Arrays.asList(MainMenuOption.QUIT_MENU,
                                                                   MainMenuOption.LIST_BOOKS,
                                                                   MainMenuOption.CHECKOUT_BOOK,
                                                                   MainMenuOption.RETURN_BOOK,
                                                                   MainMenuOption.BOOK_DETAILS)
        );

        MainMenuController mainMenuController = new MainMenuController(mainMenuList, new BookRepository());

        consolePrinter.printToConsoleWithLineBreak("Welcome message");
        mainMenuController.listMenu();
        ConsoleReader consoleReader = new ConsoleReader();
        String userInput = consoleReader.readUserInput();

        MainMenuOption selectedOption = mainMenuController.selectedOption(Integer.valueOf(userInput));
        mainMenuController.executeActionForOption(selectedOption);

    }
}
