package com.twu.biblioteca.view;

import com.twu.biblioteca.model.MainMenuOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMenuList {

    final private List<MainMenuOption> options;

    public MainMenuList(final List<MainMenuOption> options){
        this.options = options;
    }

    public List<String> menuStringList() {
        List<String> menuStringList = new ArrayList<>();
//        for(MainMenuOption mainMenuOption: Arrays.stream(MainMenuOption.values()).map(ge)){
//            menuStringList.add(mainMenuOption.getValue());
//        }

        return menuStringList;
    }
}
