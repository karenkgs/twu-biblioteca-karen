package com.twu.biblioteca.controller;

import com.twu.biblioteca.factory.BookFactory;
import com.twu.biblioteca.factory.MovieFactory;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.view.BookList;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;
import com.twu.biblioteca.view.MovieList;

import java.util.List;

public class MainMenuController {

    private BookRepository bookRepository;
    private MovieRepository movieRepository;

    public MainMenuController(BookRepository bookRepository, MovieRepository movieRepository) {
        this.bookRepository = bookRepository;
        this.movieRepository = movieRepository;
    }

    public MainMenuOption selectedOption(final int optionNumber) {
        final MainMenuOption selectedOption = MainMenuOption.getOptionForKey(optionNumber);
        return selectedOption;
    }

    public boolean executeActionForOption(MainMenuOption selectedMainMenuOption) {
        switch (selectedMainMenuOption){
            case QUIT_MENU:
                return quitMenu();
            case LIST_BOOKS:
                return listBooks();
            case CHECKOUT_BOOK:
                return checkoutBook();
            case RETURN_BOOK:
                return returnBook();
            case BOOK_DETAILS:
                return detailBook();
            case LIST_MOVIES:
                return listMovies();
            case CHECKOUT_MOVIE:
                return checkoutMovie();
            case RETURN_MOVIE:
                return returnMovie();
            default:
                return false;
        }
    }

    private boolean returnMovie() {
        return false;
    }

    private boolean checkoutMovie() {
        ConsoleReader consoleReader = new ConsoleReader();
        MovieCheckout movieCheckout = new MovieCheckout();

        String movieName = consoleReader.readUserInput();
        Movie movieToCheckout = movieRepository.searchMovieByName(movieName);

        Movie checkedOutMovie = movieCheckout.checkoutMovie(movieToCheckout);

        return !checkedOutMovie.isAvailable();
    }

    private boolean listMovies() {
        final MovieList movieList = new MovieList(MovieFactory.movies());
        final List<String> outputMovieList = movieList.namePlusIsAvailableList();

        if(outputMovieList.size() > 0){
            final ConsolePrinter consolePrinter = new ConsolePrinter();

            for (final String movieLine: movieList.namePlusIsAvailableList()){
                consolePrinter.printToConsoleWithLineBreak(movieLine);
            }

            return true;
        }

        return false;
    }

    private boolean quitMenu(){
        return true;
    }

    private boolean listBooks(){
        final BookList bookList = new BookList(BookFactory.books());
        final List<String> outputBookList = bookList.titlePlusIsAvailableList();

        if(outputBookList.size() > 0){
            final ConsolePrinter consolePrinter = new ConsolePrinter();

            for (final String bookLine: bookList.titlePlusIsAvailableList()){
                consolePrinter.printToConsoleWithLineBreak(bookLine);
            }

            return true;
        }

        return false;
    }

    private boolean checkoutBook() {
        ConsoleReader consoleReader = new ConsoleReader();
        BookCheckout bookCheckout = new BookCheckout();

        String bookTitle = consoleReader.readUserInput();
        Book bookToCheckout = bookRepository.searchBookByTitle(bookTitle);

        Book checkedOutBook = bookCheckout.checkoutBook(bookToCheckout);

        return !checkedOutBook.isAvailable();
    }

    private boolean returnBook() {
        ConsoleReader consoleReader = new ConsoleReader();
        BookReturn bookReturn = new BookReturn();

        String bookTitle = consoleReader.readUserInput();
        Book bookToReturn = bookRepository.searchBookByTitle(bookTitle);

        Book returnedBook = bookReturn.returnBook(bookToReturn);

        return !returnedBook.isAvailable();
    }

    private boolean detailBook() {
        ConsoleReader consoleReader = new ConsoleReader();

        String bookTitle = consoleReader.readUserInput();
        Book bookToDetail = bookRepository.searchBookByTitle(bookTitle);

        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.printToConsole(bookToDetail.toString());

        return true;
    }

    public void listMenu(){
        List<String> mainMenuList = MainMenuOption.valuesList();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        for(String menuOptionString: mainMenuList){
            consolePrinter.printToConsoleWithLineBreak(menuOptionString);
        }
    }

}
