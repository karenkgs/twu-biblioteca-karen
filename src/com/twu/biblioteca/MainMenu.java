package com.twu.biblioteca;

import java.util.List;

public class MainMenu {

    private List<MainMenuOption> options;

    public MainMenu(List<MainMenuOption> options){
        this.options = options;
    }

    public MainMenuOption getOption(int i) {
        return options.get(i-1);
    }

    public String getOptionValue(int i){
        return this.getOption(i).getValue();
    }

    public static class MainMenuOption {

        private int key;
        private String value;

        public MainMenuOption(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public String getValue() {
            return String.format("%d - %s", getKey(), value);
        }

    }
}
