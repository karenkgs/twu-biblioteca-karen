package com.twu.biblioteca.controller;

import com.twu.biblioteca.factory.MainMenuOptionFactory;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

import java.util.List;
import java.util.Optional;

public class MainMenu {

    final private ConsoleReader consoleReader;
    final private ConsolePrinter consolePrinter;
    final private RentableCheckout rentableCheckout;
    final private RentableReturn rentableReturn;
    final private BookRepository bookRepository;
    final private MovieRepository movieRepository;

    public MainMenu(ConsoleReader consoleReader,
                    ConsolePrinter consolePrinter,
                    RentableCheckout rentableCheckout,
                    RentableReturn rentableReturn,
                    BookRepository bookRepository,
                    MovieRepository movieRepository) {
        this.consoleReader = consoleReader;
        this.consolePrinter = consolePrinter;
        this.rentableCheckout = rentableCheckout;
        this.rentableReturn = rentableReturn;
        this.bookRepository = bookRepository;
        this.movieRepository = movieRepository;
    }

    public MainMenuOption selectedOption(final int optionNumber) {
        final MainMenuOption selectedOption = MainMenuOption.getOptionForKey(optionNumber);
        return selectedOption;
    }

    public void executeActionForOption(final MainMenuOption selectedMainMenuOption) {
        Optional<MainMenuAction> optionalMainMenuAction = (MainMenuOptionFactory.mainMenuActions()
                .entrySet()
                .stream()
                .filter(map -> map.getKey() == selectedMainMenuOption.getKey())
                .map(map -> map.getValue())
                .findFirst());

        MainMenuAction mainMenuAction = optionalMainMenuAction.orElse(null);
        if (mainMenuAction != null) {
            mainMenuAction.performAction();
        }

    }

    public void listMenu() {
        final List<String> mainMenuList = MainMenuOption.valuesList();
        for (String menuOptionString : mainMenuList) {
            consolePrinter.printToConsoleWithLineBreak(menuOptionString);
        }
    }
}
