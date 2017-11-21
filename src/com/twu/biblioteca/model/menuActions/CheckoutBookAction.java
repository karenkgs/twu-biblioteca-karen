package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.RentableCheckout;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.interfaces.Rentable;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class CheckoutBookAction implements MainMenuAction {

    @Override
    public void performAction() {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        checkoutRentable(searchBook());
    }

    @Override
    public int actionKey() {
        return 2;
    }

    private void checkoutRentable(Rentable rentableToCheckout) {
        RentableCheckout rentableCheckout = new RentableCheckout();

        rentableCheckout.checkoutRentable(rentableToCheckout);
    }

    private Rentable searchBook() {
        ConsoleReader consoleReader = new ConsoleReader();
        BookRepository bookRepository = new BookRepository();

        final String bookTitle = consoleReader.readUserInput();
        return bookRepository.searchBookByTitle(bookTitle);
    }
}
