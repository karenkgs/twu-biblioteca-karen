package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.RentableList;

import java.util.List;

public class ListMoviesAction implements MainMenuAction {
    @Override
    public void performAction() {
        listRentable(new RentableList(MovieRepository.movieList));
    }

    @Override
    public int actionKey() {
        return 5;
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
