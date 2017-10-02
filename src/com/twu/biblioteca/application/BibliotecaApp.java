package com.twu.biblioteca.application;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.MainMenuController;
import com.twu.biblioteca.controller.RentableCheckout;
import com.twu.biblioteca.controller.RentableReturn;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class BibliotecaApp {

    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        MainMenuController mainMenuController = new MainMenuController(new ConsoleReader(), consolePrinter, new RentableCheckout(),
                                                                       new RentableReturn(), new BookRepository(), new MovieRepository());

        consolePrinter.printToConsoleWithLineBreak(StringConstants.WELCOME);
        MainMenuOption selectedOption;

        do {
            mainMenuController.listMenu();
            ConsoleReader consoleReader = new ConsoleReader();
            String userInput = consoleReader.readUserInput();

            selectedOption = mainMenuController.selectedOption(Integer.valueOf(userInput));
            mainMenuController.executeActionForOption(selectedOption);

        } while (selectedOption != MainMenuOption.QUIT_MENU);


    }
}
