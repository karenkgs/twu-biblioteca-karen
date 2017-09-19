package com.twu.biblioteca.model;

import java.util.List;

public class MainMenu {

    private List<MainMenuOption> options;

    public MainMenu(List<MainMenuOption> options){
        this.options = options;
    }

    public MainMenuOption getOption(int i) {
        return options.get(i-1);
    }

    public String getOptionValue(int i) {
        return this.getOption(i).getValue();
    }

}
