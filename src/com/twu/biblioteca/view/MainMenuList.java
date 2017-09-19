package com.twu.biblioteca.view;

import com.twu.biblioteca.model.MainMenuOption;

import java.util.List;

public class MainMenuList {

    final private List<MainMenuOption> options;

    public MainMenuList(final List<MainMenuOption> options){
        this.options = options;
    }

    public MainMenuOption getOption(final int i) {
        return options.get(i-1);
    }

    public String getOptionValue(final int i) {
        return this.getOption(i).getValue();
    }

}
