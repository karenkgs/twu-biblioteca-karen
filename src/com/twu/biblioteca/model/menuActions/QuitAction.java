package com.twu.biblioteca.model.menuActions;

import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.controller.Login;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.view.ConsolePrinter;

public class QuitAction implements MainMenuAction {
    @Override
    public void performAction() {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.printToConsoleWithLineBreak(StringConstants.QUIT);
        Login.loggedInUser = null;
    }

    @Override
    public int actionKey() {
        return 0;
    }
}
