package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.RentableList;

import java.util.List;

public class ListBooksAction implements MainMenuAction {

    @Override
    public void performAction() {
        listRentable(new RentableList(BookRepository.bookList));
    }

    @Override
    public int actionKey() {
        return 1;
    }

    private void listRentable(RentableList rentableList) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        final List<String> outputRentableList = rentableList.titlePlusIsAvailableList();

        if(outputRentableList.size() > 0) {

            for (final String rentableLine: rentableList.titlePlusIsAvailableList()) {
                consolePrinter.printToConsoleWithLineBreak(rentableLine);
            }

        }
    }
}
