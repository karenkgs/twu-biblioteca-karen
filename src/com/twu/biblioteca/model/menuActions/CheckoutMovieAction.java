package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.RentableCheckout;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.interfaces.Rentable;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class CheckoutMovieAction implements MainMenuAction {

    @Override
    public void performAction() {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        checkoutRentable(searchMovie());
    }

    @Override
    public int actionKey() {
        return 6;
    }

    private Rentable searchMovie() {
        ConsoleReader consoleReader = new ConsoleReader();
        MovieRepository movieRepository = new MovieRepository();

        final String name = consoleReader.readUserInput();
        return movieRepository.searchMovieByName(name);
    }

    private void checkoutRentable(Rentable rentableToCheckout) {
        RentableCheckout rentableCheckout = new RentableCheckout();
        final Rentable checkedOutRentable = rentableCheckout.checkoutRentable(rentableToCheckout);
    }

}
