package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.interfaces.Rentable;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class BookDetailsAction implements MainMenuAction {
    @Override
    public void performAction() {
        detailRentable(searchBook());
    }

    @Override
    public int actionKey() {
        return 4;
    }

    private void detailRentable(Rentable rentableToDetail) {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.printToConsole(rentableToDetail.toString());
    }

    private Rentable searchBook() {
        ConsoleReader consoleReader = new ConsoleReader();
        BookRepository bookRepository = new BookRepository();

        final String bookTitle = consoleReader.readUserInput();
        return bookRepository.searchBookByTitle(bookTitle);
    }
}
