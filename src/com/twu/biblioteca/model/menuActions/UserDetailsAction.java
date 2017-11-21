package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.controller.Login;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.view.ConsolePrinter;

public class UserDetailsAction implements MainMenuAction {

    @Override
    public void performAction() {
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.printToConsoleWithLineBreak(Login.loggedInUser.toString());
    }

    @Override
    public int actionKey() {
        return 9;
    }
}
