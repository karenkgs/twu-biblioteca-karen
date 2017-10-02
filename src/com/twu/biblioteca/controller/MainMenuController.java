package com.twu.biblioteca.controller;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.model.Rentable;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;
import com.twu.biblioteca.view.RentableList;

import java.util.List;

public class MainMenuController {

    final private ConsoleReader consoleReader;
    final private ConsolePrinter consolePrinter;
    final private RentableCheckout rentableCheckout;
    final private RentableReturn rentableReturn;
    final private BookRepository bookRepository;
    final private MovieRepository movieRepository;

    public MainMenuController(ConsoleReader consoleReader,
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
        switch (selectedMainMenuOption){
            case QUIT_MENU:
                quitMenu();
                break;
            case LIST_BOOKS:
                listBooks();
                break;
            case CHECKOUT_BOOK:
                checkoutBook();
                break;
            case RETURN_BOOK:
                returnBook();
                break;
            case BOOK_DETAILS:
                detailBook();
                break;
            case LIST_MOVIES:
                listMovies();
                break;
            case CHECKOUT_MOVIE:
                checkoutMovie();
                break;
            case RETURN_MOVIE:
                returnMovie();
                break;
            case MOVIE_DETAILS:
                detailMovie();
                break;
        }
    }

    public void listMenu(){
        final List<String> mainMenuList = MainMenuOption.valuesList();
        for(String menuOptionString: mainMenuList){
            consolePrinter.printToConsoleWithLineBreak(menuOptionString);
        }
    }

    private void quitMenu(){
        consolePrinter.printToConsoleWithLineBreak(StringConstants.QUIT);
    }

    private void returnBook() {
        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        if (returnRentable(searchBook())){
            consolePrinter.printToConsoleWithLineBreak(StringConstants.SUCCESSFULL);
        } else {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.UNSUCCESSFULL);
        }
    }

    private void returnMovie() {
        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        if(returnRentable(searchMovie())){
            consolePrinter.printToConsoleWithLineBreak(StringConstants.SUCCESSFULL);
        } else {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.UNSUCCESSFULL);
        }
    }

    private boolean returnRentable(Rentable rentableToReturn) {
        final Rentable returnedRentable = rentableReturn.returnRentable(rentableToReturn);
        return !returnedRentable.isAvailable();
    }

    private Rentable searchBook() {
        final String bookTitle = consoleReader.readUserInput();
        return bookRepository.searchBookByTitle(bookTitle);
    }

    private Rentable searchMovie() {
        final String name = consoleReader.readUserInput();
        return movieRepository.searchMovieByName(name);
    }

    private boolean listMovies() {
        return (listRentable(new RentableList(MovieRepository.movieList)));
    }

    private boolean listBooks(){
        return (listRentable(new RentableList(BookRepository.bookList)));
    }

    private boolean listRentable(RentableList rentableList) {
        final List<String> outputRentableList = rentableList.titlePlusIsAvailableList();

        if(outputRentableList.size() > 0){

            for (final String rentableLine: rentableList.titlePlusIsAvailableList()){
                consolePrinter.printToConsoleWithLineBreak(rentableLine);
            }

            return true;
        }
        return false;
    }


    private boolean checkoutBook() {
        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        return checkoutRentable(searchBook());
    }

    private boolean checkoutMovie() {
        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_TITLE);
        return checkoutRentable(searchMovie());
    }

    private boolean checkoutRentable(Rentable rentableToCheckout) {
        final Rentable checkedOutRentable = rentableCheckout.checkoutRentable(rentableToCheckout);
        return !checkedOutRentable.isAvailable();
    }

    private void detailBook() {
        detailRentable(searchBook());
    }

    private void detailMovie() {
        detailRentable(searchMovie());
    }

    private void detailRentable(Rentable rentableToDetail) {
        consolePrinter.printToConsole(rentableToDetail.toString());
    }
}
