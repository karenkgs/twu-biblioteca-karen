package com.twu.biblioteca.application;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.Login;
import com.twu.biblioteca.controller.MainMenu;
import com.twu.biblioteca.controller.RentableCheckout;
import com.twu.biblioteca.controller.RentableReturn;
import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.view.ConsolePrinter;
import com.twu.biblioteca.view.ConsoleReader;

public class BibliotecaApp {

    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ConsoleReader consoleReader = new ConsoleReader();
        Login login = new Login(new UserRepository());

        MainMenu mainMenu = new MainMenu(consoleReader, consolePrinter, new RentableCheckout(),
                                                                       new RentableReturn(), new BookRepository(), new MovieRepository());

        consolePrinter.printToConsoleWithLineBreak(StringConstants.WELCOME);
        consolePrinter.printToConsoleWithLineBreak(StringConstants.SIGN_IN);

        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_USERNAME);
        String userName = consoleReader.readUserInput();

        consolePrinter.printToConsoleWithLineBreak(StringConstants.ASK_FOR_PASSWORD);
        String password = consoleReader.readUserInput();

        if(login.loginUser(userName, password)){
            MainMenuOption selectedOption;

            do {
                mainMenu.listMenu();
                String userInput = consoleReader.readUserInput();

                selectedOption = mainMenu.selectedOption(Integer.valueOf(userInput));
                mainMenu.executeActionForOption(selectedOption);

            } while (selectedOption != MainMenuOption.QUIT_MENU);

        } else {
            consolePrinter.printToConsoleWithLineBreak(StringConstants.UNSUCCESSFULL);
        }

    }
}
