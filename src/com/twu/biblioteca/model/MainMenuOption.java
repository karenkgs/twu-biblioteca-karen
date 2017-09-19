package com.twu.biblioteca.model;

public enum MainMenuOption {

    LIST(1, "List Books"),
    CHECKOUT(2, "Checkout Book");

    final private int key;
    final private String value;

    MainMenuOption(int key, String value) {
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
