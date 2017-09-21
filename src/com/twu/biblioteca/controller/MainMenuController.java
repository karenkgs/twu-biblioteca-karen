package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.view.MainMenuList;

public class MainMenuController {

    private final MainMenuList mainMenuList;

    public MainMenuController(final MainMenuList mainMenuList) {
        this.mainMenuList = mainMenuList;
    }

    public MainMenuOption selectedOption(final int optionNumber) {
        final MainMenuOption selectedOption = mainMenuList.getOptionForKey(optionNumber);
        return selectedOption;
    }

}
