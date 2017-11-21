package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.interfaces.Rentable;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class MovieDetailsAction implements MainMenuAction {
    @Override
    public void performAction() {
        detailRentable(searchMovie());
    }

    @Override
    public int actionKey() {
        return 8;
    }

    private Rentable searchMovie() {
        ConsoleReader consoleReader = new ConsoleReader();
        MovieRepository movieRepository = new MovieRepository();

        final String name = consoleReader.readUserInput();
        return movieRepository.searchMovieByName(name);
    }

    private void detailRentable(Rentable rentableToDetail) {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.printToConsole(rentableToDetail.toString());
    }

}
