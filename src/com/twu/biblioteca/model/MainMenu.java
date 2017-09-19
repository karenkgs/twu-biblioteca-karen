package com.twu.biblioteca.model;

import java.util.List;

public class MainMenu {

    final private List<MainMenuOption> options;

    public MainMenu(final List<MainMenuOption> options){
        this.options = options;
    }

    public MainMenuOption getOption(final int i) {
        return options.get(i-1);
    }

    public String getOptionValue(final int i) {
        return this.getOption(i).getValue();
    }

}
