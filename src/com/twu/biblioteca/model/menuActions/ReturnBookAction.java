package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.RentableReturn;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.interfaces.Rentable;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class ReturnBookAction implements MainMenuAction {

    @Override
    public void performAction() {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        if (returnRentable(searchBook())) {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.SUCCESSFULL);
        } else {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.UNSUCCESSFULL);
        }
    }

    @Override
    public int actionKey() {
        return 3;
    }

    private Rentable searchBook() {
        ConsoleReader consoleReader = new ConsoleReader();
        BookRepository bookRepository = new BookRepository();

        final String bookTitle = consoleReader.readUserInput();
        return bookRepository.searchBookByTitle(bookTitle);
    }

    private boolean returnRentable(Rentable rentableToReturn) {
        RentableReturn rentableReturn = new RentableReturn();

        final Rentable returnedRentable = rentableReturn.returnRentable(rentableToReturn);
        return !returnedRentable.isAvailable();
    }
}
