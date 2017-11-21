package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.RentableReturn;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.interfaces.Rentable;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class ReturnMovieAction implements MainMenuAction {
    @Override
    public void performAction() {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        if(returnRentable(searchMovie())) {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.SUCCESSFULL);
        } else {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.UNSUCCESSFULL);
        }
    }

    @Override
    public int actionKey() {
        return 7;
    }

    private Rentable searchMovie() {
        ConsoleReader consoleReader = new ConsoleReader();
        MovieRepository movieRepository = new MovieRepository();

        final String name = consoleReader.readUserInput();
        return movieRepository.searchMovieByName(name);
    }

    private boolean returnRentable(Rentable rentableToReturn) {
        RentableReturn rentableReturn = new RentableReturn();

        final Rentable returnedRentable = rentableReturn.returnRentable(rentableToReturn);
        return !returnedRentable.isAvailable();
    }
}
