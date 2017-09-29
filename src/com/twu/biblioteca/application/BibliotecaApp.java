package com.twu.biblioteca.application;

import com.twu.biblioteca.controller.MainMenuController;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class BibliotecaApp {

    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        MainMenuController mainMenuController = new MainMenuController(new BookRepository(), new MovieRepository());

        consolePrinter.printToConsoleWithLineBreak("Welcome message");
        mainMenuController.listMenu();
        ConsoleReader consoleReader = new ConsoleReader();
        String userInput = consoleReader.readUserInput();

        MainMenuOption selectedOption = mainMenuController.selectedOption(Integer.valueOf(userInput));
        mainMenuController.executeActionForOption(selectedOption);

    }
}
