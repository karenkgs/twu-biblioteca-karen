package com.twu.biblioteca.view;

import com.twu.biblioteca.model.MainMenuOption;

import java.util.List;
import java.util.Optional;

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

    public MainMenuOption getOptionForKey(final int key) {
        final Optional<MainMenuOption> optionForKey = options.stream()
                                                             .filter(option -> option.getKey() == key)
                                                             .findAny();

        return optionForKey.orElse(null);
    }
    //Deixar aqui ou no enum?

}
